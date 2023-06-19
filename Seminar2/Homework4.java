// Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке

package Seminar2;

public class Homework4 {
    public static void main(String[] args) {
        String text = ".3 + 1.56 = ";
        double a = Double.parseDouble(text.substring(0, text.indexOf("+") - 1));
        double b = Double.parseDouble(text.substring(text.indexOf("+") + 1, text.length() - 3));
        Double c = a + b;
        System.out.println(text + c.toString());
    }
}
