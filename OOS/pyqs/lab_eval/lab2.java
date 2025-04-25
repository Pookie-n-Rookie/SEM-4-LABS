import java.util.*;

class res {
  double sum =1; 
  int curr = 1;
  boolean available = false; 

  synchronized void val(int curr) throws Exception {
    while (available) wait(); 
    this.curr = curr;
    available = true;
    notify(); 
  }

  synchronized void Summ() throws Exception {
    while (!available) wait(); // wait until new value is available
    double d = 1.0 / curr;
    sum += d;
    Thread.sleep(1000);
    System.out.println("Added 1/" + curr + " = " + d + " | Total sum = " + sum);
    available = false;
    notify(); 
  }

  public double getSum() {
    return sum;
  }
}

class t1 extends Thread {
  res r;
  t1(res r) {
    this.r = r;
    start();
  }

  public int factorial(int n) {
    int ans = 1;
    for (int i = 1; i <= n; i++) ans *= i;
    return ans;
  }

  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        int fact = factorial(i);
        r.val(fact);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class t2 extends Thread {
  res r;
  t2(res r) {
    this.r = r;
    start();
  }

  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        r.Summ();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

class mm {
  public static void main(String[] args) throws Exception {
    res r = new res();
    t1 thread1 = new t1(r);
    t2 thread2 = new t2(r);

    // Wait for both threads to finish
    thread1.join();
    thread2.join();

    System.out.println("Final result of series: " + r.getSum());
  }
}

