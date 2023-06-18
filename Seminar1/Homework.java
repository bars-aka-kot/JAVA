package Seminar1;

import java.util.*;

public class Homework {
    // Task 1
    static int rnd() {
        int i = new Random().nextInt(1500, 2000);
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
    static int[] mult(int i) {
        int count = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) { // Short.MAX_VALUE = 32767
            if (j % i == 0)
                count++;
        }
        int[] array = new int[count];
        count = 0;
        for (int j = i; j <= Short.MAX_VALUE && count <= array.length; j++, count++) {
            if (j % i == 0)
                array[count] = j;
        }
        return (array);
    }

    // Task 4
    static int[] nonmult(int i) {
        int count = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) { // Short.MIN_VALUE = -32768
            if (j % i == 0)
                count++;
        }
        int[] array = new int[count];
        count = 0;
        for (int j = Short.MIN_VALUE; j >= Short.MIN_VALUE && count <= array.length; j++, count++) {
            if (j % i == 0)
                array[count] = j;
        }
        return (array);
    }

    public static void main(String[] args) {
        int i = rnd();
        System.out.println(i);
        int n = bits(i);
        System.out.println(n);
        int[] m1 = mult(i);
        System.out.println(m1);
        int[] m2 = nonmult(i);
        System.out.println(m2);
    }
}