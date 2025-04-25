import java.util.*;
import java.io.*;

class res {
  Scanner sc;
  boolean is_t = false; 
  int sum = 0;
  int curr = 0;

  res() throws Exception {
    sc = new Scanner(new File("a.txt"));
  }

  synchronized boolean reead() throws Exception {
    while (is_t) wait(); 

    if (!sc.hasNextInt()) {
      notify(); 
      return false;
    }

    curr = sc.nextInt();
    is_t = true; 
    notify();
    return true;
  }

  synchronized void dosum() throws Exception {
    while (!is_t) wait(); 

    System.out.println("curr val is " + curr);
    sum += curr;
    is_t = false;
    notify();
  }
}

class t1 extends Thread {
  res t;
  boolean hasWork;

  t1(res t) {
    this.t = t;
  }

  public void run() {
    try {
      hasWork = t.reead(); 
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class t2 extends Thread {
  res t;

  t2(res t) {
    this.t = t;
  }

  public void run() {
    try {
      t.dosum();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class ans {
  public static void main(String[] args) throws Exception {
    res t = new res();

    while (true) {
      t1 reader = new t1(t);
      t2 summer = new t2(t);
      reader.start();
      reader.join(); // wait for producer to finish

      if (!reader.hasWork) break; // exit if no more input

      summer.start();
      summer.join(); // wait for consumer to finish
    }

    System.out.println("Total sum is: " + t.sum);
  }
}
