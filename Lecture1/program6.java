package Lecture1;

import java.util.Scanner;

// Управляющие конструкции: 
// условный оператор
public class program6 {
    public static void main(String[] args) {
        // int a = 1;
        // int b = 2;
        // int c;
        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
        // }
        // System.out.println(c);

        // int a = 1;
        // int b = 2;
        // int c = 0;
        // if (a > b) c = a;
        // if (b > a) c = b;
        // System.out.println(c);

        // тернарный оператор
        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b;
        // System.out.println(min);

        // Оператор выбора
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int a = iScanner.nextInt();

        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("a");
                break;
            case 5:
                System.out.println("b");
                break;
            default:
                System.out.println("default");
                break;
        }
        iScanner.close();
    }

}