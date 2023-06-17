import java.util.Random;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        int i = 't';
        float f = .543f;
        System.out.println(f);
        long l;
        double d;
        short sh;
        byte b;
        char ch = 'g';
        System.out.println(ch);
        boolean b1 = false;

        // ------------------------------------------------

        int[] lst = new int[12];
        Random random = new Random();
        for (int j = 0; j < lst.length; j++)
            lst[j] = random.nextInt(2000);

        int[] tmp = new int[lst.length + 3];
        System.arraycopy(lst, 0, tmp, 0, lst.length);
        lst = tmp;

        i = 0;
        for (int j = 0, tm = 12; j < 12 && tm > -250; j++, tm -= 23, i += j)
            System.out.println(i); // 0 1 3 6 10 15 21 28 36 45 55 66 - заканчивается с выполнением условия (j < 12
                                   // && tm > -250)
        System.out.println(i); // 78 - выполняет последний шаг (j++ и i += j), потом выходит из цикла
        if (b1)
            System.out.println(b1);

        String str = "Привет Мир!";
        str += "?";

        System.out.println(str.substring(1, str.length() - 1));
        System.out.println("HI!".toLowerCase().repeat(3).length());

        Scanner scanner = new Scanner(System.in);

        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s);
        } while (!s.equals("q"));
        scanner.close();
    }

}