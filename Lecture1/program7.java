package Lecture1;

//
public class program7 {
    public static void main(String[] args) {
        // Цикл while
        // int value = 1234234;
        // int count = 0;

        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);

        // Цикл do while
        // int value = 321;
        // int count = 0;

        // do {
        // value /= 10;
        // count++;
        // } while (value != 0);
        // System.out.println(count);

        /*
         * continue, break
         * Операторы для управления циклами — continue и break.
         * Выполнение следующей итерации цикла — continue.
         * Прерывание текущей итерации цикла — break
         * ближайшего к оператору
         */

        // Оператор цикла for
        // int s = 0;
        // for (int i = 1; i <= 10; i++) {
        // s += i;
        // }
        // System.out.println(s);
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)
                break;
            System.out.println(i);
        }
        // Вложенные циклы
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for :
        // Работает только для коллекций
        // int arr[] = new int[10];
        // for (int item : arr) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
    }
}
