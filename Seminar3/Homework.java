/*Пусть дан произвольный список из 100 целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */

package Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Collections;

public class Homework {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lst.add(new Random().nextInt(20));
        }
        System.out.println(lst);

        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0)
                iterator.remove();
        }
        System.out.println(lst);
        int minValue = Collections.min(lst);
        int maxValue = Collections.max(lst);

        float sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        float avg = sum / lst.size();

        System.out.println(sum);
        System.out.println(lst.size());
        System.out.println("Min value = " + minValue);
        System.out.println("Max value = " + maxValue);
        System.out.printf("Average value = " + "%.4f", avg);
    }
}
