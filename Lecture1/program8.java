package Lecture1;

import java.io.*;

// Работа с файлами
public class program8 {
    // Создание и запись\ дозапись
    public static void main1(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append("10");
            fw.append('\n');
            fw.write("line 3");
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Чтение, 1-й Вариант посимвольно
    public static void main(String[] args) throws Exception {
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
}
