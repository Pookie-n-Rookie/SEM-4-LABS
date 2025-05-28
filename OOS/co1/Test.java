import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.lang.reflect.*;
// class a{
//         public static void main(String[] args) {
//                 System.out.println(sqrt(25));
//         }
// }

// class Main {
  
//         public static void main(String args[]){
//                 main("Ju","IT");
//                 // main("2.2 sem");
//                 }    
//         public static void main(String args1,String arg2){
//                     Main.main("OOS");
//                     System.out.println(args1 +" "+arg2);
//                     }
//         public static void main(String args){
//                         System.out.println(args);
//                             }
// }
// OOS
//JU IT
//2.2 sem
//  


// abstract class s1{
//         s1(){
//                 System.out.println("s1");
//         }
//         abstract void show();
// }
// class s2 extends s1{
//         void show(){
//                 System.out.println("s2 calling show");

//         }
//         public static void main(String[] args) {
//                 s1 t=new s2();
//                 t.show();
//         }
// }

        // class Base{
        //         final public void show(){
        //         System.out.println("B:show");
        //         }
        // }
        // class Child extends Base{
        //         try{
        //         public void show(){ //Compilation error
        //         System.out.println("C:show");
        //         }
        //         }
        //         catch(Exception e){
        //                 e.printStackTrace();
        //         }       
        // }
        // class Main{
        //         public static void main(String args[]){
        //         Base b=new Child();
        //         b.show();
        //         }
        // }

// interface GIN {
//         void display();
//     }
    
   
//     interface IN1 extends GIN {
//     }
    
//     interface IN2 extends GIN {
//     }
    
    
//     class Sample implements IN1, IN2 {
       
//         public void display() {
//             System.out.println("Hello from GIN's display()");
//         }
    
//         public static void main(String[] args) {
//             Sample s = new Sample();
//             s.display();
//         }
//     }

// class low_bal extends Exception{
//         low_bal(int amt){
//                 printStackTrace();

//         }
// }
// class high_bal extends Exception{
//         high_bal(int amt){
//                 printStackTrace();
//         }
// }
// class a{
//         int acc=10000;
//         // can withdraw between 1000 to 10000 ATM MACHINE DHORLAM
//         void get(int chk)throws Exception{
//                 if(chk>acc)throw new high_bal(chk);
//                 else if(chk<1000)throw new low_bal(chk);
//                 else acc-=chk;
//         }
//         public static void main(String[] args)throws Exception {
//                 a n=new a();
//                 n.get(99);
//         }
// }

// abstract class base{
//         base(int x){
//                 System.out.println("ok");
//         }
//         abstract void display();
// }
// class derived extends base{
//         derived(int x){
//                 super(x);
//         }
//   void display(){
//         System.out.println("ok derived ");
//   }       
// }
// class gc extends derived{
//         gc(){
//                 super(0);
//         }
//          void display(){
//                 super.display();
//                 System.out.println("ok gc ");
//         }
//         public static void main(String[] args) {
//                 gc ob=new gc();
//                 ob.display();
        
//         String s1 = new String("hello");
//         String s2 = new String("hello");
//         String s3 = "HI";
//         String s4 = "HI";
//         System.out.println(s1 == s2);
//         System.out.println(s3 == s4);


// }}

// interface IN1{
// default void sh(){
//         System.out.println("ok nice2");
// }
// }
// interface IN2{
//  default void sh(){
//                 System.out.println("ok nice");
//         }
// }
// class oos implements IN1,IN2{
//         public void sh(){
//                 IN1.super.sh();
//         }
//         public static void main(String[] args) {
//                 new oos().sh();
//         }
// }
// import p1.p2.*;

// class x{
//         public static void main(String[] args) {
//                 b n=new b();
//                 n.pdt(5, 2);
//         }
// }

// class Base {
    //     Base(String msg) {
    //         System.out.println("Base constructor called: " + msg);
    //     }
    
    //     void fun() {
    //         System.out.println("Base fun() method");
    //     }
    // }
    
    // class Child extends Base {
    //     Child(String msg) {
    //         super(msg); // Call Base class constructor
    //         System.out.println("Child constructor called: " + msg);
    //     }
    
       
    //     void fun() {
    //         super.fun();
    //         System.out.println("Child fun() method");
    //     }
    // }
    
    // class GrandChild extends Child {
    //     GrandChild(String msg) {
    //         super(msg); // Call Child class constructor (which calls Base constructor)
    //         System.out.println("GrandChild constructor called: " + msg);
    //     }
    
    //     void show() {
    //         System.out.println("Calling overridden fun()...");
    //         fun();
    //     }
    // }
    
//    class Test {
//         static void change(int a ,int arr[]){
//             a=6;
//             arr[0]=7;

//         }
//         public static void main(String[] args) {
//            int arr[]={2,3,4};
//            int a=5;
//            change(a,arr);
//            System.out.println(arr[0]+" "+ a+" ");
//         }
//     }

// File: tt.java (in default package or any package)
//  class tt {
//     public static void main(String[] args) {
//          new p1.a1.show();
//          new p2.a1.show();
//     }
// }
import java.lang.reflect.Method;

// class abc {
//     public static void main(String[] args) throws Exception {
//         String s = " Hello";
//         Class c = s.getClass();

//         Method m1 = c.getMethod("startsWith", String.class);
//         Method m2 = c.getMethod("equalsIgnoreCase", String.class);
//         Method m3 = c.getMethod("toUpperCase");
//         Method m4 = c.getMethod("concat", String.class);
//         Method m5 = c.getMethod("compareTo", String.class);
//         Method m6 = c.getMethod("trim");
//         Method m7 = c.getMethod("lastIndexOf", String.class);

//         System.out.println("Starts with 'H': " + m1.invoke(s, "H"));
//         System.out.println("Equals ignore case 'heLLO': " + m2.invoke(s, "heLLO"));
//         System.out.println("To Upper Case: " + m3.invoke(s));
//         System.out.println("Concatenated with 'hi': " + m4.invoke(s, "hi"));
//         System.out.println("Compare to 'Hello': " + m5.invoke(s, "Hello"));
//         System.out.println("Trimmed: " + m6.invoke(s));
//         System.out.println("Last index of 'l': " + m7.invoke(s, "l"));

//         StringBuffer st = new StringBuffer("OKmylover");
//         Class c2 = st.getClass();

//         Method M1 = c2.getMethod("substring", int.class);
//         Method M2 = c2.getMethod("substring", int.class, int.class); 


//         System.out.println("Substring from index 2: " + M1.invoke(st,2));
//         System.out.println("Substring from 2 to 6: " +   M2.invoke(st,2,6));
//     }
// }
class gen{
    <T extends Comparable <T>>void freq_cnt(T arr[]){
        int n=arr.length;
        int maxi=0,ind=-1;
        for(int i=0;i<n;i++){
            int flg=0;
            for(int j=i-1;j>=0;j--){
                if(arr[i].compareTo(arr[j])==0){
                    flg=1;
                    break;
                }
            }
            if(flg==0){
                int cnt=0;
                for(int j=i;j<n;j++){
                    if(arr[i].compareTo(arr[j])==0){
                        cnt++;
                    } 
                }
                System.out.println("freq of "+arr[i]+" "+cnt);
                if(maxi<cnt){
                    maxi=cnt;
                    ind=i;
                }
            }
        }
        System.out.println("max freq of "+arr[ind]+" "+maxi);
    }
}
class ab{
    public static void main(String[] args) {
        gen g=new gen();
        Integer arr[]={1,2,4,1,1,5,2,4,6,4,1,4,4,6,4};
        Character ch[]={'a','b','c','a','a','c','b','a'};
        String st[]={"RAM","SHYAM","SB","SK","SB","SB","RAM","SB"};
        g.freq_cnt(arr);
        g.freq_cnt(ch);
        g.freq_cnt(st);

    }
}