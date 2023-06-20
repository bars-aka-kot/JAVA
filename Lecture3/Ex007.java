package Lecture3;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            // col.remove(); // Exception in thread "main"
            // java.lang.UnsupportedOperationException
            System.out.println(col.next());
            // col.next(); // Exception in thread "main" java.util.NoSuchElementException
        }

    }
}
