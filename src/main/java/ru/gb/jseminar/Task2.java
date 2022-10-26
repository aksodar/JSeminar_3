package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2 {

    // Дан список содержащий строки и числа в строковом формате.
    // C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом
    public static void main(String[] args) {
        Task2 tk = new Task2();
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        tk.printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){
        Iterator<String> iter = list.listIterator();
        while (iter.hasNext()){
            try{
                int number = Integer.valueOf(iter.next());
                System.out.println("It`s Number: " + number);
            } catch(NumberFormatException e) {
                System.out.println("It`s String: " );
            }
            
        }
    }

}
