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
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            try{
                Integer.valueOf(it.next());
                System.out.println("it's number");
            } catch (NumberFormatException e){
                System.out.println("it's stirng");
            }
        }
    }

}
