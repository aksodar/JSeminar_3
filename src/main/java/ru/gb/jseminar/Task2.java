package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {

    // Дан список содержащий строки и числа в строковом формате.
    // C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        t2.printResultOfCheck(list);
    }

    public void printResultOfCheck(List<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            try {
                int a = Integer.valueOf(iter.next());
                System.out.println(a + " It's a number");
            } catch (NumberFormatException e) {
                System.out.println(" It's a string");
            }

        }

    }

}
