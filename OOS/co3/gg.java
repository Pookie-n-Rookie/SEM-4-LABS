import java.lang.reflect.*;
// class t{
//   static<T>void disp(T elem){
//     System.out.println(elem.getClass().getName()+" = "+elem);
//   }
//   public static void main(String arg[]){
//     disp(15);
//     disp("JU");
//   }
// }
// class gg {
//   // Generic sort method (ascending order)
//   public <T extends Comparable<T>> void sort(T[] arr) {
//     for (int j = 0; j < arr.length - 1; j++) {
//       for (int i = j + 1; i < arr.length; i++) {
//         if (arr[i].compareTo(arr[j]) < 0) {  // Ascending
//           T temp = arr[i];
//           arr[i] = arr[j];
//           arr[j] = temp;
//         }
//       }
//     }
//   }

//   // Generic print method
//   public <T> void print(T[] arr) {
//     for (T val : arr) {
//       System.out.print(val + " ");
//     }
//     System.out.println();
//   }
// }

// class m {
//   public static void main(String[] args) {
//     gg obj = new gg(); // One object for all types

//     Character[] charArr = { 'z', 'a', 'u', 'y', 'j', 'p' };
//     Integer[] intArr = { 5, 1, 8, 3, 2 };
//     String[] strArr = { "banana", "apple", "orange", "mango" };

//     obj.sort(charArr);
//     obj.print(charArr);  // a j p u y z

//     obj.sort(intArr);
//     obj.print(intArr);   // 1 2 3 5 8

//     obj.sort(strArr);
//     obj.print(strArr);   // apple banana mango orange
//   }
// }



// interface a{
//   default void show(){
//     System.out.println("hi");
//   }
// }
// class b implements a{
//   public void show(){
//     System.out.println("hello");
//   }
// }

// class c{
//   public static void main(String[] args) {
//     a i=new b();
//     Class d=i.getClass();
//     System.out.println("class is"+d);
//     System.out.println("class name is"+d.getName());
//     Method []m=d.getMethods();
//     for(Method v:m){
//       System.out.println(v);
//     }
//     Class d2=a.class;
//     System.out.println("class is "+d2);
//   }
// }
import java.lang.reflect.Field;

class X {
  public double d1 = 1.5;
  public double d2 = 5.0;
}

class ACC {
  public static void main(String[] args) throws Exception {
    X ob = new X();
    Class<?> c = ob.getClass();

    if (args.length == 0) {
      System.out.println("Please provide a field name (e.g., d1 or d2).");
      return;
    }

    String fn = args[0];  // Field name from command-line
    Field f = c.getDeclaredField(fn);

    System.out.println("Before: " + fn + " = " + f.getDouble(ob));
    f.setDouble(ob, 15.0);
    System.out.println("After: " + fn + " = " + f.getDouble(ob));
  }
}
