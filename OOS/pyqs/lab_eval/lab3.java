import java.util.*;

class res {
  boolean b = false;
  int sum1 = 0, sum2 = 0, sum3 = 0;

  synchronized void print(int i, boolean isEven) throws Exception {
    while (b != isEven) {
      wait();
    }

    System.out.print(i + " ");
    Thread.sleep(1000);
    if (isEven) sum2 += i;
    else sum1 += i;

    sum3 += i;
    b = !b;
    notify();
  }

  void getSum() {
    System.out.println();
    System.out.println("Sum of even numbers: " + sum2);
    System.out.println("Sum of odd numbers: " + sum1);
    System.out.println("Total sum: " + sum3);
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
        t.print(i, false); // false = odd
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class mm {
  public static void main(String arg[]) throws Exception {
    res t = new res();
    oth odd = new oth(t);
    eth even = new eth(t);

    // Wait for threads to complete
    odd.join();
    even.join();

    t.getSum(); // Print the final sums
  }
}
