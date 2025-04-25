import java.util.*;
import java.io.*;

class res {
    BufferedReader br;
    boolean t = false; // false: producer's turn, true: consumer's turn
    int curr;
    int sum = 0;

    res() throws Exception {
        br = new BufferedReader(new FileReader("a.txt"));
    }

    synchronized void read() throws Exception {
        String line;
        while ((line = br.readLine()) != null) {
            String[] nums = line.split(" ");
            for (String a : nums) {
                while (t) wait(); // Wait if it's consumer's turn
                if (a.trim().isEmpty()) continue;
                System.out.println("Read: " + a);
                curr = Integer.parseInt(a);
                t = true;
                notify();
            }
        }
    
        while (t) wait();
        curr = -1; 
        t = true;
        notify();
    }
    
    synchronized void add() throws Exception {
        while (true) {
            while (!t) wait(); // Wait if it's producer's turn
            if (curr == -1) break; // Stop on sentinel
            System.out.println("Added: " + curr);
            sum += curr;
            t = false;
            notify();
        }
    }
}

class t1 extends Thread {
    res r;

    t1(res r) {
        this.r = r;
        start();
    }

    public void run() {
        try {
            r.read();
        } catch (Exception e) {
            e.printStackTrace();
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
        try {
            r.add();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class mm2 {
    public static void main(String[] args) throws Exception {
        res r = new res();
        t1 T1 = new t1(r);
        t2 T2 = new t2(r);
        T1.join();
        T2.join();
        System.out.println("sum is = " + r.sum);
    }
}
