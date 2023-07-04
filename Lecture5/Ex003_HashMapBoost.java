package Lecture5;

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); // по умолчанию длина - 10 элементов.
        Map<Integer, String> map2 = new HashMap<>(30); // длина 30 элементов
        Map<Integer, String> map3 = new HashMap<>(30, 0.8f); // количество элементов 30, удвоение при заполнении на 80%
    }
}