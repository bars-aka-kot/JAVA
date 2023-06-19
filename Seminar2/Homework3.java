/*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder. */
package Seminar2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Homework3 {

    public static void main(String[] args) throws IOException {

        // Вызываем метод заполнения текстового файла случайно заполненными символами
        writeRnd();

        // выполнение основной задачи: замер времени замены символа "а" на символ "А" в
        // строке (строка берется из файла) методами String и StringBuilder
        BufferedReader br = new BufferedReader(new FileReader(new File("Seminar2/file_Homework3.txt")));
        String line;
        double startTime = System.currentTimeMillis();
        while ((line = br.readLine()) != null) {
            line = line.replace("a", "A");
        }
        System.out.println("Время выполнения String: " + (System.currentTimeMillis() - startTime) + " мс");

        startTime = System.currentTimeMillis();
        while ((line = br.readLine()) != null) {
            StringBuilder str = new StringBuilder(line);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    str.setCharAt(i, 'A');
                }
            }
        }
        br.close();
        System.out.println("Время выполнения StringBuilder: " + (System.currentTimeMillis() - startTime) + " мс");
    }

    // Метод создания и записи в файл строки из 100_000 случайных символов
    public static void writeRnd() throws IOException {
        try (FileWriter fw = new FileWriter(new File("Seminar2/file_Homework3.txt"), true)) {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 1_000_000; i++) {
                str.append(rndChar());
            }
            fw.write(str.toString());
        }
    }

    // Метод подбора случайного символа
    public static char rndChar() {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        return (alphabet.charAt(r.nextInt(alphabet.length())));
    }
}
