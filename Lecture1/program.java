package Lecture1;

/**
 * program
 */
/**
 * program
 */
public class program {

    public static void main(String[] args) {

        // // Явная типизация
        // String s = "asdasd";
        // short age = 10;
        // int salary = 12345;
        // System.out.println(s); // asdasd
        // System.out.println(age); // 10
        // System.out.println(salary); // 12345

        // float e = 2.7f;
        // System.out.println(e); // 2.7
        // double f = 123.123;
        // System.out.println(f); // 123.123

        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // char chs = 'a';
        // System.out.println(Character.isDigit(chs)); // false

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false

        // String str = "Hello world";
        // System.out.println(str); // Hello world

        // // Неявная типизация
        // var a = 123;
        // System.out.println(a); // 123
        // var d = 123.456;
        // System.out.println(d); // 123.456
        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double
        // d = 1022;
        // System.out.println(d); // 1022
        // // d = "mistake";
        // // error: incompatible types:
        // // cannot convert from String to double

        // /**
        // * Классы-обертки (используется для доступа к расширенным параметрам типа
        // * переменной)
        // * Примитив Обертка
        // * int Integer
        // * short Short
        // * long Long
        // * byte Byte
        // * float Float
        // * double Double
        // * char Character
        // * boolean Boolean
        // */
        // int i = 23_123_234;
        // System.out.println(Integer.MAX_VALUE); // 2147483647
        // System.out.println(Integer.MIN_VALUE); // -2147483648
        // String std = "qwer";
        // System.out.println(std.charAt(0)); // q

        // /*
        // * Операции JAVA
        // * Присваивание: =
        // * Арифметические: *, /, +, -, %, ++, --
        // * Операции сравнения: <, >, ==, !=, >=, <=
        // * Логические операции ||, &&, ^, !
        // * Побитовые операции: <<, >>, &, |, ^
        // */
        // // int gr = 123;
        // // System.out.println(gr++); // 123 постфиксный инкримент
        // // System.out.println(gr); // 124
        // // System.out.println(++gr); // 125 префиксный инкримент
        // // System.out.println(gr); // 125

        // }

        // static String getType(Object o) {
        // return o.getClass().getSimpleName();

        // int a = 123;
        // a = --a - a--;
        // System.out.println(a); // 0

        // boolean f = 123 > 234;
        // boolean a = 123 < 234;
        // boolean b = 123 != 234;
        // System.out.println(f); // false
        // System.out.println(a); // true
        // System.out.println(b); // true

        // int a = 8;
        // // 1000
        // // a = a << 1;
        // System.out.println(a << 1); // 16
        // // 10000
        // int a = 5;
        // int b = 2;
        // System.out.println(a | b); // 7
        // System.out.println(a & b); // 0
        // System.out.println(a ^ b); // 7
        // 101 101 101
        // 010 010 010
        // // 111 000 111
        // String s = "qww1"; // length = 5, index 0..4
        // // Следующая операция предполагает проверку поэтапную. Если левая часть
        // false,
        // // то правая часть не проверяется
        // // boolean b = s.length() >= 5 && s.charAt(4) == '1';
        // // Следующая операция предполагает проверку полную. Если левая часть false,
        // то
        // // все равно правая часть проверяется
        // boolean b = s.length() >= 5 & s.charAt(4) == '1';
        // // Аналогично работает || и |
        // System.out.println(b);

        // int[] arr = new int[10];
        // arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // arr[3] = 13;
        // System.out.println(arr[3]);
        // System.out.println(arr.length);

        // int[] arr1[] = new int[3][5];
        // for (int[] line : arr1) {
        // for (int item : line) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();
        // }

        // int[][] arr = new int[3][4];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.printf("%d ", arr[i][j]);
        // }
        // System.out.println();
        // }
        // int i = 123;
        // double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0

        // d = 3.1415;
        // i = (int) d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3

        // d = 3.9415;
        // i = (int) d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3

        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range

        // int[] a = new int[10];
        // double[] d = a; // Error: cannot convert from int[] to double[]
        // ИЗУЧАЕМ ковариантность и контравариантность
    }

}
