import java.util.*;
import java.lang.reflect.*;
//   class test{
//     int i;
//   }

// class Main{
//   public static void main(String args[]){
//     // test t=new test();--->0
//     // test t;----->Compiler error
//     try{
      
//       System.out.println(t.i);
//   }
//   catch(Exception e){
//     e.printStackTrace();
//   }
// }
// }


// public class T{
//   int t=20;
//   T(){
//     t=40;
//   }
// }
// class Main{
//   public static void main(String args[]){
//     T t1=new T();
//     System.out.println(t1.t);
//     int arr[]=new int[2];
//     System.out.println(arr[0]);
//     System.out.println(arr[1]);
//   }
// }
//40
//  class T{
//   int t=20;
//   static int z=80;
//   T(){
//     t=40;
//   }
// }
// class Main{
//   public static void main(String args[]){
//     T t1=new T();
//     System.out.println(t1.t);
//     int arr[]=new int[2];
//     System.out.println(arr[0]);
//     System.out.println(arr[1]);
//     System.out.println(T.z);

//   }
// }

// class gen<T,U>{
//   T t;
//   U u;
//   gen(T t,U u){
//     this.t=t;
//     this.u=u;
//   }
//   void show(){
//     System.out.println(t+" "+u);
//   }
   
// }
// class ass{
//   public static void main(String[] args) {
//     gen<Integer,Character>gg=new gen<Integer,Character>(2,'a');
//     gg.show();
//   }
// }
// class ff{
//   final int val=7;
//   private int x=9;
//   final private int y=3;
//   private final void m1(int x){
//       System.out.println("hiiii");
//   }

// }

// class gg{
//   public static void main(String[] args)throws Exception {
//     ff ob=new ff();
//     Class c=ob.getClass();
//     Field f1=c.getDeclaredField("val");
//     Field f2=c.getDeclaredField("x");
//     Field f3=c.getDeclaredField("y");
//     Method mm=c.getDeclaredMethod("m1",int.class);
//     f1.setAccessible(true);
//     f2.setAccessible(true);
//     f3.setAccessible(true);
//     mm.setAccessible(true);
//     System.out.println(f1.getInt(ob)+" "+f2.getInt(ob)+" "+f3.getInt(ob));
//     f1.setInt(ob,8);
//     f2.setInt(ob,8);
//     f3.setInt(ob,8);
//     System.out.println(f1.getInt(ob)+" "+f2.getInt(ob)+" "+f3.getInt(ob));
//     mm.invoke(ob,6);

  
//   }
// }
// import java.lang.reflect.Method;

// class a1 {
//     public static void main(String[] args) throws Exception {
//         StringBuffer st = new StringBuffer("HIv");
//         Class c = st.getClass();

//         Method m1 = c.getMethod("length");
//         Method m2 = c.getMethod("capacity");
//         Method m3 = c.getMethod("indexOf", String.class);
//         Method m4 = c.getMethod("charAt", int.class);

//         System.out.println("Length: " + m1.invoke(st));
//         System.out.println("Capacity: " + m2.invoke(st));
//         System.out.println("Index of 'v' is: " + m3.invoke(st, "v"));
//         System.out.println("Char at index 0: " + m4.invoke(st, 0));
//     }
// }
// Generic class with two type parameters
// class Sample<T, U> {
//   T first;
//   U second;

//   // Constructor 1: Takes two parameters and initializes both members
//   Sample(T first, U second) {
//       this.first = first;
//       this.second = second;
//       System.out.println("Constructor with two parameters called");
//   }

//   // Constructor 2: Takes one parameter and assigns default to second
//   Sample(T first) {
//       this(first, null);  // Calls Constructor 1
//       System.out.println("Constructor with one parameter called");
//   }

//   // Constructor 3: No parameters
//   Sample() {
//       this(null, null);  // Calls Constructor 1
//       System.out.println("Default constructor called");
//   }

//   void display() {
//       System.out.println("First: " + first + ", Second: " + second);
//   }
// }
//  class Main {
//   public static void main(String[] args) {

//        new Sample<>("Hello", 100).display();
//        new Sample<>("OnlyFirst").display();
//        new Sample<>().display();
  
//   }
// }
class gen<T>{
    <T extends Comparable <T>>void sort(T arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
class ansi{
    public static <T> void print(T arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        // gen g1=new gen<>();//valid
        // gen g2=new gen();//valid
        gen<Double>g3=new gen();

        Integer arr1[]={4,6,7,2,1,0};
        Character arr2[]={'b','z','a','u','y','f','d'};
        String arr3[]={"ZAKI","Baki","NAKI","AAKI","FAKI"};
        g3.sort(arr1);
        g3.sort(arr2);
        g3.sort(arr3);
        print(arr1);
        print(arr2);
        print(arr3);
    }
}