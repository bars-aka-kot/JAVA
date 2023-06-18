package Seminar2;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String str1 = iScanner.nextLine();
        String str2 = iScanner.nextLine();
        str2 = new StringBuilder(str2).reverse().toString();
        System.out.println(str1.equals(str2));
        iScanner.close();

    }

}
