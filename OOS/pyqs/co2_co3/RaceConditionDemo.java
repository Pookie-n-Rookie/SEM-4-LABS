
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
// // //******2024 ct*****//
// // class XX {
// //   int i1=0, i2=0;
  
// //   void inc1() 
// //    { synchronized(this)   //synchronized(XX.class)
// // 	  {
// // 	   i1++; 
// //      }
// //    }
// //   void inc2() 
// //    { synchronized (this) //synchronized(XX.class)
// // 	  {
// // 	  i2++; 
// //      }
// //    }
// // }

// // public class RaceConditionDemo extends Thread {
// // 	XX ob;
// // 	RaceConditionDemo(XX ob)
// // 	{
// // 		this.ob=ob;
// // 		start();
// // 	}
// //  public void run()
// //  {
// // 	 for(int i=0;i<30000;i++)
// // 		 ob.inc1();
// //  }
// //  public static void main(String args[])throws Exception
// //  {
// // 	 XX ob=new XX();
// // 	 RaceConditionDemo rc=new RaceConditionDemo(ob);
// // 	 for(int i=0;i<30000;i++)
// // 		   ob.inc2();
// // 	System.out.println("Final value="+ob.i1+ " "+ob.i2);
	 
// // 	 rc.join();
// // 	 System.out.println("Final value="+ob.i1+ " "+ob.i2);
	 
	 
	 
// //  }
// // }

// // // class xx{
// // // 	private final int p=5;
// // // 	private final void f(){
// // // 		System.out.println("ok");
// // // 	}
// // // }
// // // class t{
// // // 	public static void main(String[] args)throws Exception {
// // // 	xx ob=new xx();
// // // 	Class c=ob.getClass();
// // // 	Method m=c.getDeclaredMethod("f");
// // // 	m.setAccessible(true);
// // // 	m.invoke(ob);
// // // 	Field f=c.getDeclaredField("p");
// // // 	f.setAccessible(true);
// // // 	System.out.println("before--> "+f.getInt(ob));
// // // 	f.setInt(ob, 6);
// // // 	System.out.println("before--> "+f.getInt(ob));
// // // 	}
// // // }

// // // class MyThread extends Thread {
// // // 	public void run() {
// // // 			System.out.println("Child thread running...");
// // // 			try {
// // // 					Thread.sleep(1000);
// // // 			} catch (Exception e) {}
// // // 			System.out.println("Child thread finished.");
// // // 	}
// // // }

// // //  class JoinDemo {
// // // 	public static void main(String[] args) throws InterruptedException {
// // // 			MyThread t = new MyThread();
// // // 			t.start();

// // // 			t.join();  // main waits for t to finish
// // // 			System.out.println("Main thread resumes after child thread ends.");
// // // 	}
// // // }


// // //  class FixedInput {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);

// // //         int a = sc.nextInt();
// // //         sc.nextLine(); // clear leftover newline
// // //         System.out.println("a=" + a);

// // //         String s = sc.nextLine();
// // //         System.out.println("s=" + s);
// // // 					 // read string
// // //         char ch = sc.next().charAt(0);    // take first character
// // //         System.out.println("ch=" + ch);
// // //     }
// // // }
// // // import java.lang.reflect.Method;

// // // class FixedInput {
// // //     public static void main(String[] args) throws Exception {
// // //         StringBuffer s = new StringBuffer("HELLO");

// // //         Class<?> c = s.getClass();

// // //         Method m1 = c.getMethod("length");  
// // //         Method m2 = c.getMethod("capacity");
// // //         Method m3 = c.getMethod("setCharAt", int.class, char.class);

    
// // //         int len = (int) m1.invoke(s);
// // //         int cap = (int) m2.invoke(s);
// // //         m3.invoke(s, 1, 'A');  

// // //         System.out.println("Length: " + m1.invoke(s));
// // //         System.out.println("Capacity: " +m2.invoke(s));
// // //         System.out.println("Modified StringBuffer: " + s);
// // //     }
// // // }


// // //******2023 ct*****//
// // // class A {
// // // }

// // // class B extends A implements Runnable {
// // //  B() {
// // //         Thread t = new Thread(this);
// // //         t.start();
// // //     }
// // // 		public void run() {
// // // 			System.out.println("Thread is running");
// // // 	}
// // // }

// // // class Mt {
// // //     public static void main(String[] args) {
// // //         B b = new B();
// // //     }
// // // }
// // // class g{
// // // 	<T extends Comparable<T>>T get_max(T arr[]){
// // // 		T ch=arr[0];
// // // 		for(int i=1;i<arr.length;i++){
// // //         if(ch.compareTo(arr[i])<0){
// // // 					ch=arr[i];
// // // 				}
// // // 		}
// // // 		return ch;
// // // 	}
// // // 	public static void main (String a[]){
// // // 		g ob=new g();
// // // 		Integer[]a1={2,4,9,3,1};
// // // 		Double[]a2={2.5,0.44,1.9,3.4,1.02};
// // // 		String[]a3={"yealand","poland","zealand"};
// // // 		System.out.println(ob.get_max(a1));
// // // 		System.out.println(ob.get_max(a2));
// // // 		System.out.println(ob.get_max(a3));


// // // 		}
// // // }


// // class synm {
// // 	boolean a = true;

// // 	synchronized void print(int x) {
// // 		try {
// // 			if (x % 2 == 0) {
// // 				while (a) wait();
// // 			} else {
// // 				while (!a) wait();
// // 			}
// // 			System.out.println(new java.util.Date() + "--->" + x);
// // 			Thread.sleep(1000);  
// // 			a = !a;
// // 			notify();
// // 		} catch (InterruptedException e) {
// // 			e.printStackTrace();
// // 		}
// // 	}
// // }

// // class P1 extends Thread {
// // 	synm ob;

// // 	P1(synm ob) {
// // 		this.ob = ob;
// // 	}

// // 	public void run() {
// // 		for (int i = 1; i <= 9; i += 2) {
// // 			ob.print(i);
// // 		}
// // 	}
// // }

// // class P2 extends Thread {
// // 	synm ob;

// // 	P2(synm ob) {
// // 		this.ob = ob;
// // 	}

// // 	public void run() {
// // 		for (int i = 2; i <= 10; i += 2) {
// // 			ob.print(i);
// // 		}
// // 	}
// // }

// // class tt {
// // 	public static void main(String[] args) throws Exception {
// // 		synm ob = new synm();
// // 		P1 p1 = new P1(ob);
// // 		P2 p2 = new P2(ob);
// // 		p1.start();
// // 		p2.start();
// // 	}
// // }

// // class synm {
// // 	boolean a = true;

// // 	void print(int x) {
// // 		synchronized (this) {
// // 			try {
// // 				if (x % 2 == 0) {
// // 					while (a) wait(); 
// // 				} else {
// // 					while (!a) wait(); 
// // 				}
// // 				System.out.println(new java.util.Date() + "--->" + x);
// // 				Thread.sleep(1000);
// // 				a = !a;
// // 				notify();
// // 			} catch (InterruptedException e) {
// // 				e.printStackTrace();
// // 			}
// // 		}
// // 	}
// // }

// // class P1 extends Thread {
// // 	synm ob;

// // 	P1(synm ob) {
// // 		this.ob = ob;
// // 	}

// // 	public void run() {
// // 		for (int i = 1; i <= 9; i += 2) {
// // 			ob.print(i);
// // 		}
// // 	}
// // }

// // class P2 extends Thread {
// // 	synm ob;

// // 	P2(synm ob) {
// // 		this.ob = ob;
// // 	}

// // 	public void run() {
// // 		for (int i = 2; i <= 10; i += 2) {
// // 			ob.print(i);
// // 		}
// // 	}
// // }

// // class tt {
// // 	public static void main(String[] args) throws Exception {
// // 		synm ob = new synm();
// // 		P1 p1 = new P1(ob);
// // 		P2 p2 = new P2(ob);
// // 		p1.start();
// // 		p2.start();
// // 	}
// // }


// // import java.io.*;

// // class ttt {
// //     public static void main(String[] args) {
// //         int count = 0;

// //         try (
// //             BufferedReader bb = new BufferedReader(new FileReader("a.txt"));
// //             BufferedWriter br = new BufferedWriter(new FileWriter("b.txt"))
// //         ) {
// //             String line;
// //             while ((line = bb.readLine()) != null) {
// //                 // Split the line into words
// //                 String[] words = line.split("\\s+");

// //                 for (String word : words) {
// //                     // Check if the word contains at least one digit
// //                     if (word.matches(".*\\d.*")) {
// //                         br.write(word);
// //                         br.newLine();
// //                         count++;
// //                     }
// //                 }
// //             }

// //             // Writing the count of words with at least one digit
// //             br.write("Total words containing at least one digit: " + count);
// //             br.newLine();

// //         } catch (IOException e) {
// //             e.printStackTrace();
// //         }
// //     }
// // }
// // class t1{
// // 	static<T> void disp(T elem){
// // 		System.out.println(elem.getClass().getName()+"="+elem);
// // 	}

// // 	public static void main(String[] args) {
// // 		disp(15);
// // 	}
// // }

// // class tt{
// // 	public static void main(String args[])throws Exception{
// // 	Scanner sc=new Scanner(System.in);
// 	// int k=sc.nextInt();
// 	// // sc.nextLine();
// 	// double d=sc.nextDouble();
// 	// char ch=sc.next().charAt(0);
// 	// sc.nextLine();
// 	// String ass=sc.nextLine();
// 	// System.out.println(k+" "+d+" "+ch+"FDGF"+ass);
// 	// int s=0,c=0;
// 	// while(sc.hasNextInt()){
// 	// 	s+=sc.nextInt();
// 	// 	c++;
// 	// }
// 	// double avg=(double)s/c;
// // 	// System.out.println(avg);
// // 	InputStreamReader isr=new InputStreamReader(System.in);
// // 	BufferedReader br=new BufferedReader(isr);
// // 	int roll=Integer.parseInt(br.readLine());
// // 	char ch=br.readLine().charAt(0);
// // 	String s=br.readLine();
// // 	System.out.println(roll+" "+ch+" "+s);
// // 	}
// // }
// class ab{
// 	static boolean pali(String s){
// 		int n=s.length();
// 		int i=0,j=n-1;
// 		while(i<=j){
// 			if(s.charAt(i)!=s.charAt(j)){
// 				return false;
// 			}
// 			i++;
// 			j--;
// 		}
// 		return true;
// 	}
// 	static boolean vowel(String s){
// 		int n=s.length();
// 		s=s.toLowerCase();
// 		int cnt=0;
// 		for(int i=0;i<s.length();i++){
// 			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
// 				cnt++;
// 			}
// 		}
// 		if(cnt>1)return false;
// 		return true;
// 	}
// 	static boolean numcheck(String s){
// 		int n=s.length();
// 		s=s.toLowerCase();
// 		int cnt=0;
// 		for(int i=0;i<s.length();i++){
// 			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
// 				cnt++;
// 			}
// 		}
// 		if(cnt==0)return false;
// 		return true;
// 	}
// 	public static void main(String[] args)throws Exception {
// 		// BufferedReader br=new BufferedReader(new FileReader(args[0]));
// 		// BufferedWriter bw=new BufferedWriter(new FileWriter(args[1]));
		
// 		// String s="";
// 		// while((s=br.readLine())!=null){
// 		// 	String arr[]=s.split(" ");
// 		// 	for(int i=0;i<arr.length;i++){
// 		// 		if(numcheck(arr[i])){
// 		// 			bw.write(arr[i]);
// 		// 			bw.write(" ");
// 		// 		}
// 		// 		}
// 		// 	bw.newLine();
// 		// }
// 		// br.close();
// 		// bw.close();

// 	}
// }
interface gc{
	void disp();
}

interface p1 extends gc{
}
interface p2 extends gc{
}
class ans implements p1,p2{
	public void disp(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		new ans().disp();
	}
}