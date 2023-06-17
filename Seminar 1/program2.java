import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float first = iScanner.nextFloat();
        System.out.println("Введите второе число: ");
        float second = iScanner.nextFloat();

        System.out.println("Введите действие: ");
        String word = iScanner.nextLine();
        float res = 0;
        switch (word) {
            case "+":
                res = first + second;
                System.out.printf("%f\n", res);
                break;
            case "-":
                res = first - second;
                System.out.printf("%f\n", res);
                break;
            case "*":
                res = first * second;
                System.out.printf("%f\n", res);
                break;
            case "/":
                res = first / second;
                System.out.printf("%f\n", res);
                break;
            default:
                System.out.println("Нет действия");
                break;
        }
        iScanner.close();
    }
}
