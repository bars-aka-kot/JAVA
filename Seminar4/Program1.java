/*Организовать ввод и хранение данных пользователей. ФИО возраст и пол
вывод в формате Фамилия И.О. возраст пол
добавить возможность выхода или вывода списка отсортированного по возрасту!)
*реализовать сортировку по возрасту с использованием индексов
*реализовать сортировку по возрасту и полу с использованием индексов */
package Seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите количество пользователей: ");
        int n = Integer.parseInt(iScanner.nextLine());
        String[] users = new String[n];
        for (int i = 0; i < users.length; i++) {
            System.out.print("Введите фамилию: ");
            String surname = iScanner.nextLine();
            System.out.print("Введите имя: ");
            String name = iScanner.nextLine();
            System.out.print("Введите отчество: ");
            String fathersname = iScanner.nextLine();
            System.out.print("Введите возраст: ");
            String age = iScanner.nextLine();
            System.out.print("Введите пол: ");
            String gender = iScanner.nextLine();
            users[i] = surname + " " + name + " " + fathersname + " " + age + " " + gender;
        }
        System.out.println("Ввод данных завершен.");
        System.out.print("Продолжить выполнение программы? Введите Y для продолжения и N для выхода из программы: ");
        String word = iScanner.nextLine().toUpperCase();
        iScanner.close();
        switch (word) {
            case "N":
                System.out.println("Выходим из программы");
                break;

            case "Y":
                // сортировка по возрасту
                Arrays.sort(users, new Comparator<String>() {
                    @Override
                    public int compare(String u1, String u2) {
                        return Integer.compare(Integer.parseInt(u1.split(" ")[3]), Integer.parseInt(u2.split(" ")[3]));
                    }
                });

                for (String user : users) {
                    System.out.println(
                            user.split(" ")[0] + " " + user.split(" ")[1].charAt(0) + "." + user.split(" ")[2].charAt(0)
                                    + "."
                                    + " " + user.split(" ")[3] + " " + user.split(" ")[4]);
                }

                // сортировка по возрасту по индексу
                String[] indexes = new String[users.length];
                for (int i = 0; i < users.length; i++) {
                    indexes[i] = Integer.toString(i);
                }

                Arrays.sort(indexes, new Comparator<String>() {
                    public int compare(String i1, String i2) {
                        return Integer.compare(Integer.parseInt(users[Integer.parseInt(i1)].split(" ")[3]),
                                Integer.parseInt(users[Integer.parseInt(i2)].split(" ")[3]));
                    }
                });

                for (String i : indexes) {
                    int j = Integer.parseInt(i);
                    System.out.println(
                            users[j].split(" ")[0] + " " + users[j].split(" ")[1].charAt(0) + "."
                                    + users[j].split(" ")[2].charAt(0) + "." + " " + users[j].split(" ")[3] + " "
                                    + users[j].split(" ")[4]);
                }

                // сортировка по возрасту и полу
                Arrays.sort(indexes, new Comparator<String>() {
                    public int compare(String i1, String i2) {
                        return Integer.compare(Integer.parseInt(users[Integer.parseInt(i1)].split(" ")[3]),
                                Integer.parseInt(users[Integer.parseInt(i2)].split(" ")[3]));
                    }
                });

                Arrays.sort(indexes, new Comparator<String>() {
                    public int compare(String i1, String i2) {
                        return users[Integer.parseInt(i1)].split(" ")[4]
                                .compareTo(users[Integer.parseInt(i2)].split(" ")[4]);
                    }
                });

                for (String i : indexes) {
                    int j = Integer.parseInt(i);
                    System.out.println(
                            users[j].split(" ")[0] + " " + users[j].split(" ")[1].charAt(0) + "."
                                    + users[j].split(" ")[2].charAt(0) + "." + " " + users[j].split(" ")[3] + " "
                                    + users[j].split(" ")[4]);
                }
                break;
        }
    }
}

/*
 * пример простой сортировки массива индексов по элементам другого массива
 * 
 * ArrayList<Integer> age = new ArrayList<>();
 * ArrayList<Integer> id = new ArrayList<>();
 * 
 * age.add(4)
 * age.add(7)
 * age.add(2)
 * age.add(8)
 * age.add(3)
 * 
 * id.add(0)
 * id.add(1)
 * id.add(2)
 * id.add(3)
 * id.add(4)
 * 
 * Collections.sort(id, Comparator<Integer>() {
 * 
 * @Override
 * public int compare(Integer o1, Integer o2){
 * return age.get(o1) - age.get(o2)
 * }
 * })
 * 
 * System.out.println(id) // [2,4,0,1,3]
 * // после этого вызываем из peoples данные по id
 * // Или можно упростить через лямбда-функцию
 * Collections.sort(id, (o1, o2) -> age.get(o1) - age.get(o2))
 */