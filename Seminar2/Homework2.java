/*Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

package Seminar2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Homework2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File("Seminar2/file_Homework2.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            StringBuilder result = new StringBuilder();
            String[] parts = line.split(",");
            for (String part : parts) {
                String[] kv = part.split(":");
                if (kv[0].contains("family")) {
                    result.append("Student ")
                            .append(kv[1].replaceAll("\"", ""))
                            .append(" ");
                } else if (kv[0].contains("mark")) {
                    result.append("got it ")
                            .append(kv[1].replaceAll("\"", ""))
                            .append(" ");
                } else if (kv[0].contains("subject")) {
                    result.append("on subject ")
                            .append(kv[1].replaceAll("\"", "").replaceAll("}", "").replaceAll("]", ""))
                            .append(".");
                }
            }
            System.out.println(result.toString());
        }
        br.close();
    }

}