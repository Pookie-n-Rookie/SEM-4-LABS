import java.util.*;
import java.io.*;
import static java.lang.Math.*;

abstract class ac{
  void show(){
    System.out.println("HEllo");
  }
}
class cc extends ac{
}
class res {
  int a=5;
  public void show(){
    System.out.println("a ="+a);
  }
  
  // public void close(){
  //   System.out.println("ok print kardiya");
  // }

}
// class ab{
//   static void change1(res []r){
//     r[0].a=10;
//     r[0].a=10;
//   }
//   static void change1(res r){
//     r.a=20;
//   }
//   public static void main(String[] args)throws Exception {
//     // String s1="java";
//     // String s2="java";
//     // String s3=new String("JAva");
//     // String s4=new String("java");
//     // System.out.println(s1==s2);
//     // System.out.println(s2==s3);
//     // System.out.println(s3==s4);
//     // System.out.println(s1);
//     // s1+='r';
//     // System.out.println(s1);
//     // System.out.println(s1.compareTo(s3));
//     // int a[][]=new int[3][];
//     // for(int i=0;i<3;i++){
//     //   a[i]=new int[i+1];
//     //   for(int j=0;j<=i;j++)a[i][j]=j+1;
//     // }
//     // for(int i=0;i<3;i++){
//     //   for(int j=0;j<=i;j++)System.out.print(a[i][j]+" ");
//     //   System.out.println();
//     // }
//     // new cc().show();
//     // StringBuffer s=new StringBuffer(5);
//     // System.out.println(s.capacity());
//     // s.append("version");
//     // System.out.println(s.capacity());
//   //   int b=0;
//   //   try(res r=new res()){
//   //     r.show();
//   //   }
//   //   catch(Exception e){
//   //     e.printStackTrace();
//   //   }
//   //   finally{
//   //     System.out.println("hello brother ");
//   // res []r={new res(),new res()};
//   // System.out.println(r[0].a);
//   // System.out.println(r[1].a);
//   // change1(r);
//   // change1(r[1]);
//   // System.out.println(r[0].a);
//   // System.out.println(r[1].a);
//   // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         File inputFile = new File("a.txt");
//         File outputFile = new File("b.txt");

//         Scanner sc = new Scanner(inputFile);
//         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

//         while (sc.hasNext()) {
//             String word = sc.next();
//             bw.write(word);
//             bw.write(" "); // Add space between words
//         }

//         sc.close();
//         bw.close(); 
//         System.out.println("Words copied successfully.");
//     }
// }
class Intrr extends Thread {
  volatile int turn = 0;
  int[] buff;
  int n = 2;  // start from first prime candidate

  int nextPrime() {
      while (true) {
          boolean isPrime = true;
          for (int i = 2; i <= Math.sqrt(n); i++) {
              if (n % i == 0) {
                  isPrime = false;
                  break;
              }
          }
          if (isPrime) return n++;
          else n++;
      }
  }

  public Intrr(int[] a) {
      buff = a;
  }

  public void run() {
      while (true) {
          while (turn != 0); // wait for consumer
          buff[0] = nextPrime();
          turn = 1;
      }
  }
}

public class Main {
  public static void main(String[] args) throws Exception {
      int[] a = new int[1];
      Intrr pb = new Intrr(a);
      pb.start(); // start the thread

      while (true) {
          while (pb.turn != 1); // wait for producer
          System.out.println("Prime: " + a[0]);
          pb.turn = 0;
          Thread.sleep(500); // just for readability
      }
  }
}


