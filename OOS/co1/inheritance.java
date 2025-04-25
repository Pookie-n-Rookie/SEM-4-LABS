import java.util.*;

// class myres implements AutoCloseable{
//   public void close(){
//     System.out.println("close it");
//   }
// }

// class m{
//   public static void main(String[] args) throws Exception {
//     try(myres r=new myres()){
//       throw new Exception("ERROR");
//     }
//   }
// }

//  class base{
//   private void show(){
//     System.out.println("from base");

//   }
// }

// class child extends base{
//   public void show(){
//     System.out.println("printing");
//   }
// }

// class main {
//   public static void main(String arg[]){
//     base ob=new child();
//     ob.show();
//   }
// }



// class base{
//   private int a;
//   protected int b;
//   base(int x,int y){
//     a=x+y;
//   }
//   void show(){
//     System.out.println("from parent a="+a);
//   }
// }

// class child extends base{
//   int c;
//   child(int x, int y){
//     super(x,y);
//     c=7;
//     b=c/2;
//   }
//   void show(){
//     super.show();
//     System.out.println("c="+c+" b="+b);
//   }
// }

// class main {
//   public static void main(String arg[]){
//     base ob=new child(3,2);
//     ob.show();
//   }
// }

// class base{
//   static void print(){
//     System.out.println("from parent print");

//   }
//   void show(){
//     System.out.println("from parent show");
//   }
//   final void fun(){
//     System.out.println("checking final func");

//   }
// }

// class child extends base{
//   static void print(){
//     System.out.println("from child print");

//   }
//   void show(){
//     System.out.println("from child show");
//   }
// }

// class main {
//   public static void main(String arg[]){
//     base ob=new child();
//     ob.show();
//     ob.print();
//     ob.fun();
//   }
// }

// interface b1{
//   default void show(){
//     System.out.println("B1");
//   }
// }
// interface b2{
//   default void show(){
//     System.out.println("B2");
//   }
// }

// class c implements b1,b2{
//   public void show(){
//     System.out.println("Child");
//     b1.super.show();
//     b2.super.show();
     

//   }
// }
// class m{
//   public static void  main(String arg[]){
//     b1 child=new c();
//     child.show();
//   }
// }
// class str{
//   public static void main(String arg[]) {
//     StringBuffer s1=new StringBuffer("BE IT OOS");
//     s1.ensureCapacity(30);
//     System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length());
//     s1.append("2nd year");
//     System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length()+" "+s1);
//     s1.insert(2,"2nd sem");
//     System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length()+" "+s1);
  
//     s1.replace(5,8,"Java");
//     System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length()+" "+s1);

//   }
//   }

// class Check {
//   void change(int arr[]) {
//       arr[0] = 1; // Modifying array (Reference Type)
//   }

//   void change(String s1) {
//       s1 += "oos"; // String is immutable, so this does not change original s1
//   }

//   public static void main(String args[]) {
//       int arr[] = {5, 2, 3};
//       String s1 = "OOP";

//       Check obj = new Check(); // Creating an object to call instance methods
//       obj.change(arr);
//       obj.change(s1);

//       System.out.println("arr[0] changes = " + arr[0] + ", s1 remains unchanged = " + s1);
//   }
// }
// class base{
//   base(int x){
//     System.out.println("base");
//   }
//   void show(){
//     System.out.println("base calling");
//   }
// }
// class child extends base{
//   child(){
//     super(5);
//   }
//   void show(){
//     super.show();
//   }
// }
// class gc extends child{
//   void show(){
//     super.show();

//     System.out.println("gc calling");
//   }
// }
// class mst{
//   public static void main(String[] args) {
//     gc t=new gc();
//     t.show();
//   }
// }

// interface IN1{
//   default void show(){
//     System.out.println("IN1");
//   }
// }
// interface IN2{
//   default void show(){
//     System.out.println("IN2");
//   }
// }

// class sample implements IN1,IN2{
//   public void show(){
//     System.out.println("sample");
//     IN1.super.show();
//   }
//   public static void main(String[] args) {
//     sample t= new sample();
//     t.show();
//   }
// }



// class b{
//   public int sum(int x,int y,int z){
//     return (x+y+z);
//   }
// }
// class c extends b{
//   public int sum(int x,int y){
//     return (x+y);
//   }
// }
// class m{
//   public static void main(String[] args) {
//     c t=new c();
    
//     System.out.println(t.sum(4,5));
//     System.out.println(t.sum(4,5,6));


//   }
// }

// class b{


//   b(){
//     System.out.println("b");

//   }
//   static{
//     System.out.println("stat");
//   }
//   {
//     System.out.println("init");
//   }
//   void show(){
//     System.out.println("hmm thik");
//   }
//   public static void main(String[] args) {
//     b t1=new b();
//     b t2=new b();
//     new b().show();
    
//   }
// }

// class myres implements AutoCloseable{
//   public void start(){
//     System.out.println("use it");

//   }
//   public void close(){
//     System.out.println("close it");
//   }
// }
// class tt{
//   public static void main(String[] args) {
//     int arr[]={1,2,3};
//     try(myres ms=new myres()){
//       ms.start();
//       int x=5/0;
//     }
//     catch (Exception e){
//       try{
//         int z1=5/0;
//       }
//       catch(Exception e1){
//         e1.printStackTrace();
//       }
//       finally{
//     System.out.println("finally inner");

//       }
//     }
//     finally{
//       try(myres m2=new myres()){
//         m2.start();
//         int z3=5/0;

//       }
//       catch(Exception e){
//         e.printStackTrace();
//       }
//       finally{
//     System.out.println("finally end");

//       }
//     }
//   }
// }



// class Res extends Exception implements AutoCloseable {  
//   Res(String message) { 
//       super(message);
//   }

//   void check(int amt) throws Res {  
//       if (amt > 1000) throw new Res("HIGH BAL");
//       else throw new Res("LOW BAL");
//   }


//   public void close() {
//       System.out.println("Exiting exception class");
//   }
// }

// class Ans {
//   public static void main(String[] args)throws Exception {
//       try (Res r = new Res("Exception Handling")) {  
//           r.check(999);  
//       }
//   }
// }

interface base{
  default void show(){
    System.out.println("Base calling");
  }
}
interface p1 extends base{
}
interface p2 extends base{
}
class gc implements p1,p2{
 
  public static void main(String[] args) {
    gc t=new gc();
    t.show();
    base b=new gc();
    b.show();
  }
}
