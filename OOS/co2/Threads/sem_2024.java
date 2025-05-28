import java.util.*;
import java.io.*;

// class res {
//   boolean is_t = false;

//   void print_odd(int i) throws Exception {
//       synchronized (this) {
//           while (is_t) wait();
//           System.out.print(i + " ");
//           Thread.sleep(1000);
//           is_t = !is_t;
//           notify();
//       }
//   }
//   void print_even(int i) throws Exception {
//       synchronized (this) {
//           while (!is_t) wait();
//           System.out.print(i + " ");
//           Thread.sleep(1000);
//           is_t = !is_t;
//           notify();
//       }
//   }
// }
// class T1 extends Thread {
//   res r;
//   T1(res r) {
//       this.r = r;
//   }
//   public void run() {
//       for (int i = 1; i <= 7; i += 2) {
//           try {
//               r.print_odd(i);
//           } catch (Exception e) {
//               e.printStackTrace();
//           }
//       }
//   }
// }
// class T2 extends Thread {
//   res r;
//   T2(res r) {
//       this.r = r;
//   }
//   public void run() {
//       for (int i = 2; i <= 8; i += 2) {
//           try {
//               r.print_even(i);
//           } catch (Exception e) {
//               e.printStackTrace();
//           }
//       }
//   }
// }
//  class ans {
//   public static void main(String[] args) {
//       res r = new res();
//       T1 t1 = new T1(r);
//       T2 t2 = new T2(r);
//       t1.start();
//       t2.start();
//   }
// }
// import java.util.*;
// import java.io.*;
// class t1 extends Thread{
//     public void run(){
//         System.out.println("okkkkk bhaiiiii");
//     }
// }
// class t2 implements Runnable{
//     public void run(){
//         System.out.println("challllll byyeeeeee");
//     }
// }

// class ab{
//     public static void main(String arg[])throws Exception{
//         t1 a=new t1();
//         System.out.println(new Date());
//         a.start();
//         Thread t=new Thread(new t2());
//         Thread.sleep(1000);
//         System.out.println(new Date());
//         t.start();

//     }
// }


// class t1 extends Thread {
//     String r1, r2;
//     int id;

//     t1(int id, String r1, String r2) {
//         this.id = id;
//         this.r1 = r1;
//         this.r2 = r2;
//     }

//     public void run() {
//         synchronized (r1) {
//             System.out.println(id + " Lock acquired on " + r1);
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }

//             System.out.println(id + " trying to Lock " + r2);

//             synchronized (r2) {
//                 System.out.println(id + " Lock acquired on " + r2);
//             }
//         }
//     }
// }

//  class ab {
//     public static void main(String arg[]) throws Exception {
//         String r1 = "Resource1";
//         String r2 = "Resource2";

//         // Deadlock scenario: thread a locks r1 then tries r2, b locks r2 then tries r1
//         t1 a = new t1(1, r1, r2);
//         t1 b = new t1(2, r1, r2);

//         a.start();
//         b.start();
//     }
// }
import java.io.*;

// class stt {
//     String name, stream;
//     int roll;
//     double cgpa;

//     stt(String name, String stream, int roll, double cgpa) {
//         this.name = name;
//         this.stream = stream;
//         this.roll = roll;
//         this.cgpa = cgpa;
//     }
// }

// class rr {
//     public static void main(String[] args) throws Exception {
//         stt arr[] = new stt[6];
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int maxi_it = 0;
//         String maxi_name = "";
//         double maxi_cgpa = 0;

//         for (int i = 0; i < 6; i++) {
//             System.out.println("Enter details for student " + (i + 1) + ":");
            
//             System.out.print("Enter name: ");
//             String s = br.readLine();

//             System.out.print("Enter stream: ");
//             String ss = br.readLine();

//             System.out.print("Enter roll number: ");
//             int x = Integer.parseInt(br.readLine());

//             System.out.print("Enter CGPA: ");
//             double y = Double.parseDouble(br.readLine());

//             arr[i] = new stt(s, ss, x, y);

//             if (ss.equals("IT") && maxi_cgpa < y) {
//                 maxi_cgpa = y;
//                 maxi_it = x;
//                 maxi_name = s;
//             }

//             System.out.println(); // Empty line for readability
//         }

//         System.out.println("Top IT Student: " + maxi_name + ", Roll: " + maxi_it + ", CGPA: " + maxi_cgpa);
//     }
// }


