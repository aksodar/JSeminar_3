package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    // Дан список содержащий строки и числа в строковом формате.
    // C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){
        for (String s : list) {
            try {
                Integer.valueOf(s);
                System.out.println(s + " является числом");
            } catch (Exception e) {
                System.out.println(s + " не является числом");
            }
        }

    }

}
