package Seminar1;

import java.util.*;

public class Homework {
    // Task 1
    static int rnd() {
        int i = new Random().nextInt(0, 2000);
        return (i);
    }

    // Task 2
    static int bits(int i) {
        int n = 0;
        while (i != 1) {
            i >>= 1;
            n++;
        }
        return (n);
    }

    // Task 3
    static ArrayList<Integer> mult(int i, int n) {
        ArrayList<Integer> m1 = new ArrayList<>();
        for (int j = i; j <= Short.MAX_VALUE; j++) { // Short.MAX_VALUE = 32767
            if (j % n == 0)
                m1.add(j);
        }
        return (m1);
    }

    // Task 4
    static ArrayList<Integer> nonmult(int i, int n) {
        ArrayList<Integer> m2 = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j <= i; j++) { // Short.MIN_VALUE = -32768
            if (j % n != 0)
                m2.add(j);
        }
        return (m2);
    }

    public static void main(String[] args) {
        int i = rnd();
        System.out.println(i);
        int n = bits(i);
        System.out.println(n);
        ArrayList<Integer> m1 = mult(i, n);
        System.out.println(m1.size());
        ArrayList<Integer> m2 = nonmult(i, n);
        System.out.println(m2.size());
    }
}