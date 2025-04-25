import java.util.*;
import java.io.*;


import java.util.*;
import java.io.*;

class z1 extends Thread {
    int buff[];
    static volatile int t = 0; // Volatile ensures visibility between threads
    int n = 2;

    int nextprime() {
        while (true) { // Loop until a prime is found
            boolean pp = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    pp = false;
                    break;
                }
            }
            if (pp) return n++;
            else n++;
        }
    }

    public z1(int[] a) {
        buff = a;
        start();
    }

    public void run() {
        while (true) {
            while (t != 0); // Wait until consumer resets t
            buff[0] = nextprime();
            t = 1;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[1];
        z1 ob = new z1(a);
        while (true) {
            while (t != 1); // Wait until producer sets t
            System.out.print(a[0] + " "); // Print with space
            t = 0;
        }
    }
}
