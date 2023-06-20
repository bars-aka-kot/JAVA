/* Задана натуральная степень k. Сформировать случайным образом список коэффициентов (значения от 0 до 100) 
многочлена степени k (вывести многочлен степени k на печать) */
package Lecture1;

import java.util.*;

public class task1 {

    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int k = input.nextInt();
        int[] lst = new int[k + 1];
        Random random = new Random();

        for (int i = 0; i <= k; i++) {
            lst[i] = random.nextInt(0, 101);
        }

        String wr = "";
        if (lst.length < 1) {
            wr = "x = 0";
        } else {
            for (int i = 0; i <= lst.length; i++) {
                if (i != lst.length - 1 && lst[i] != 0 && i != lst.length - 2) {
                    wr = wr + String.format("%a*%b^%c", lst[i], "x", (lst.length - i - 1));
                    if (lst[i + 1] != 0) {
                        wr = wr + "+";
                    }
                } else {
                    if (i == lst.length - 2 && lst[i] != 0) {
                        wr = wr + String.format("lst[i]");
                        if (lst[i + 1] != 0) {
                            wr = wr + "+";
                        }
                    }
                    if (i == lst.length - 1 && lst[i] != 0) {
                        wr = wr + String.format("lst[i] = 0");
                    }
                    if (i == lst.length - 1 && lst[i] == 0) {
                        wr = wr + " = 0";
                    }
                }
            }
        }
        System.out.println(wr);
    }
}