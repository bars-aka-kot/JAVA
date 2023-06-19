package Lecture1;

import java.io.*;
import java.util.Random;

// Работа с файлами
public class program8 {
    // Создание и запись\ дозапись
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 100_000; i++) {
                char c = rndChar();
                str.append(c);
            }
            fw.write(str.toString());
            // fw.append('\n');
            // fw.append("10");
            // fw.append('\n');
            // fw.write("line 3");
            // fw.append('\n');
            // fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Чтение, 1-й Вариант посимвольно
    public static void main2(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();
    }

    // 2-й Вариант построчно
    public static void main3(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }

    public static char rndChar() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        char c = alphabet.charAt(r.nextInt(alphabet.length()));
        return (c);
    }
}
