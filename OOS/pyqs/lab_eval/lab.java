import java.util.*;
import java.io.*;

class res {
  boolean b = false; 

  public synchronized void print(int i, boolean isEven) throws Exception {
    while (b != isEven) wait(); 

    System.err.print(i + " ");
    Thread.sleep(1000);
    b = !b;         
    notify();       
  }
}

class eth extends Thread {
  res t;

  eth(res t) {
    this.t = t;
    start();
  }

  public void run() {
    for (int i = 2; i <= 10; i += 2) {
      try {
        t.print(i, true); 
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class oth extends Thread {
  res t;

  oth(res t) {
    this.t = t;
    start();
  }

  public void run() {
    for (int i = 1; i <= 9; i += 2) {
      try {
        t.print(i, false); 
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class mm {
  public static void main(String arg[]) throws Exception {
    res t = new res();
    new oth(t);
    new eth(t);
  }
}
