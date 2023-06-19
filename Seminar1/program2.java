package Seminar1;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String first = scanner.nextLine();
        System.out.print("Введите второе число: ");
        String second = scanner.nextLine();
        System.out.print("Введите действие: ");
        String word = scanner.nextLine();
        switch (word) {
            case "+":
                int tmp = Integer.parseInt(first) + Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "-":
                tmp = Integer.parseInt(first) - Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "*":
                tmp = Integer.parseInt(first) * Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "/":
                tmp = Integer.parseInt(first) / Integer.parseInt(second);
                System.out.println(tmp);
                break;
            case "tbs":
                System.out.println(Integer.toBinaryString(Integer.parseInt(second)));
                break;
            default:
                System.out.println("Действие не поддерживается");

        }
        scanner.close();
    }
}
