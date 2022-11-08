package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {

    // Дан список содержащий строки и числа в строковом формате.
    // C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        myPrintResultOfCheck(list);
        System.out.println();
        printResultOfCheck(list);
    }

    public static void myPrintResultOfCheck(List<String> list){
        for (String s: list) {
            for (Character c: s.toCharArray()) {
                if (Character.isDigit(c)) {
                    System.out.print(String.format("%c is digit, ", c));
                } else if (Character.isLetter(c)) {
                    System.out.print(String.format("%c is letter, ", c));
                }
                else System.out.println("none");
            }
        }
    }
    public static void printResultOfCheck(List<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            try {
            Integer.valueOf(iter.next());
            System.out.println("it's number");
            } catch (NumberFormatException e) {
                System.out.println("It's letter");
            }
    }
}
}
