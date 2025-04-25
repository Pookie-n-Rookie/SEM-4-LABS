import java.util.*;
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


public class T{
  int t=20;
  T(){
    t=40;
  }
}
class Main{
  public static void main(String args[]){
    T t1=new T();
    System.out.println(t1.t);
    int arr[]=new int[2];
    System.out.println(arr[0]);
    System.out.println(arr[1]);
  }
}
//40