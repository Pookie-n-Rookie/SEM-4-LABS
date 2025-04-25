import java.util.*;
import java.io.*;

// class check{
//    static int s;
//    int a;
//    static{
//     s=10;
//    }
//    check(){
//     a=++s;
//    }
//    void show(){
//     System.out.println("a="+a+" "+"s="+s);
//    }
// }


// class Main {


//     public static void main(String[] args) 
//     {
//       System.out.println(check.s);
//     //   System.out.println(new check().s);
//     new check().show();
//     //   System.out.println(check.s);
//     check ob1=new check();
//     ob1.show();
//     check ob2=new check();
//     new check().show();
//     ob2.show();
//     String s1="aBc",s2="ABd";
//     System.out.println(s1.compareTo(s2));
//     }
// }
// 10
// a=11 s=11
// a=12 s=12
// a=14 s=14
// a=13 s=14
// -32




// class point{
//     int a;
//     int b;

//     point(int a,int b){
//         this.a=a;
//         this.b=b;
//     }
//     point(int c){
//         a=c;
//         b=2*c;
//     }
//     void show(){
//         System.out.println("a="+a+" "+"b="+b);
//     }
// }

// class m2{
//     public static void main(String args[]){
//         point p[]=new point[5];
//         for(int i=0;i<5;i++){
//             if(i<=2){
//                 p[i]=new point(i);
//             }
//             else{
//                 p[i]=new point(i,i+1);
//             }
//             p[i].show();
//         }
//     }
// }
//  class StringReferenceExample {
//     public static void main(String[] args) {
//         String s1 = "Hello";   // String literal stored in String pool
//         String s2 = s1;        // s2 points to the same reference as s1

//         System.out.println("Before modification:");
//         System.out.println("s1: " + s1); // Hello
//         System.out.println("s2: " + s2); // Hello

//         s1 = "World"; // Now s1 points to a new string, s2 still refers to "Hello"

//         System.out.println("After modification:");
//         System.out.println("s1: " + s1); // World
//         System.out.println("s2: " + s2); // Hello (remains unchanged)
//     }
// }

// class max{
//     public static void main(String[] args) {
//         main("OOS");
//     }
//     public static void main(String args1,String args2) {
//         System.out.println(args1+args2);
        
        
//     }
//     public static void main(String args1) {
//         main("oos1","oos2");
//         System.out.println(args1);
//     }
// }
abstract class s1{
    s1(){
        System.out.println("abstract class");
    }
    abstract void show();
}
class s2 extends s1{
    void show(){
        System.out.println("from s2");
    }
}

class max{
    public static void main(String[] args) {
        s1 t=new s2();
        t.show();
    }
}