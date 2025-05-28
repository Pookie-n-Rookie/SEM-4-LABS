import java.util.*;



class tt {
  public static void main(String arg[]){
    Thread t = Thread.currentThread();
    System.out.println(t);
    System.out.println(t.getName());
    System.out.println(t.getPriority());
    System.out.println(t.getState());
    System.out.println(t.getPriority());

  }
}
// class tt {
//   public static void main(String arg[]){
//     Thread t = Thread.currentThread();
//     for(;;){
//       System.out.println("Local date and time"+new java.util.Date());
//       try{
//         t.sleep(10000);
//       }
//       catch(Exception e){
//         e.printStackTrace();
//       }
//     }
//   }
// }
// class timer implements Runnable {
//   public void run() {
//     while (true) {
//       System.out.println(new java.util.Date());
//       if (Thread.interrupted()) {
//         System.out.println("Timer intt");
//         return;
//       }
//     }
//   }
// }

// public class Id {
//   public static void main(String[] args)throws Exception {
//     Thread t1 = new Thread(new timer());
//     t1.start();
//     Thread.sleep(2000);
//     t1.interrupt();
//   }
// }
// class Timer extends Thread {
//   int[] a;

//   Timer(int[] a) {
//     this.a = a;
//     start();
//   }

//   public void run() {
//     java.util.Arrays.sort(a); 
//     System.out.println("sort done");
//   }
// }

// class Chek {
//   public static void main(String[] args) throws InterruptedException {
//     int[] a = {2, 52, 0, 1, 4, -33};

//     Timer t = new Timer(a);
//     // t.join();      

//     for (int i = 0; i < a.length; i++) {
//       System.out.print(a[i] + " ");
//     }
//   }
// }

// class Printer {
//   boolean isOddTurn = true;

//   synchronized void printOdd(int number) throws InterruptedException {
//     while (!isOddTurn) {
//       wait();
//     }
//     System.out.print(number + " ");
//     isOddTurn = false;
//     notify();
//   }

//   synchronized void printEven(int number) throws InterruptedException {
//     while (isOddTurn) {
//       wait();
//     }
//     System.out.print(number + " ");
//     isOddTurn = true;
//     notify();
//   }
// }

// class T1 extends Thread {
//   Printer p;

//   T1(Printer p) {
//     this.p = p;
//   }

//   public void run() {
//     for (int i = 1; i <= 7; i += 2) {
//       try {
//         p.printOdd(i);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

// class T2 extends Thread {
//   Printer p;

//   T2(Printer p) {
//     this.p = p;
//   }

//   public void run() {
//     for (int i = 2; i <= 8; i += 2) {
//       try {
//         p.printEven(i);
//       } catch (InterruptedException e) {
//         e.printStackTrace();
//       }
//     }
//   }
// }

// public class ans {
//   public static void main(String[] args) {
//     Printer p = new Printer();
//     T1 t1 = new T1(p);
//     T2 t2 = new T2(p);
//     t1.start();
//     t2.start();
//   }
// }
// class counter{
//   int val=1;
//   void inc(){
//     val++;}
//   void dec(){
//     val--;
//   }
// }
// class rc extends Thread{
//   counter c;
//   rc(counter c){
//     this.c=c;
//     start();
//   }
//   public void run(){
//     for(int i=0;i<500;i++){
//       c.dec();
//     }
//   }
//   public static void main(String[] args) throws Exception {
//     counter c=new counter();
//     rc r=new rc(c);
//     for(int i=0;i<1000;i++){
//       c.inc();
//     }
//     r.join();
//     System.out.println("final val"+c.val);
//   }
// }

// class thrd extends Thread{
//   String r1,r2;
//   int i;
//   thrd(int i,String r1,String r2){
//     this.i=i;
//     this.r1=r1;
//     this.r2=r2;
//     start();
//   }
//   public void run(){
//     synchronized(r1){
//       System.out.println("thread"+i+"accq a lock on "+r1);
//       try{
//         sleep(2000);
//       }
//       catch(Exception e){
//         e.printStackTrace();
//       }
//       System.out.println("thread "+i+"accq a lock on "+r2);
//       synchronized(r2){
//       System.out.println("thread "+i+" accq a lock on "+r2);
        
//       }
//     }
//   }
// }

// class ddl{
//   public static void main(String[] args) {
//     String r1="A",r2="B";
//     thrd t1= new thrd(1,r1,r2);
//     thrd t2= new thrd(2,r2,r1);

//   }
// }

// import java.util.Date;

// class m1 extends Thread {
//   private boolean st = true;

//   public synchronized void psuspend() {
//     st = false;
//   }

//   public synchronized void ppresume() {
//     st = true;
//     notify();
//   }

//   public void run() {
//     try {
//       while (true) {
//         synchronized (this) {
//           while (!st) {
//             System.out.println("suspended");
//             wait(); // Wait until resume is called
//           }
//         }

//         // Print the date and sleep for 1 second when not suspended
//         System.out.println(new Date());
//         Thread.sleep(500);
//       }
//     } catch (Exception e) {
//       e.printStackTrace();
//     }
//   }
// }

// class SuspendResume {
//   public static void main(String[] args) throws Exception {
//     m1 ob = new m1();
//     ob.start();

//     while (true) {
//       // Thread.sleep(500); // Suspend after 5 seconds
//       ob.psuspend();
//       // Thread.sleep(500); // Stay suspended for 3 seconds
//       ob.ppresume();
//     }
//   }
// }
