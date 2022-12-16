package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

        Homework hw = new Homework();

        List <Integer> list = new ArrayList<>(Arrays.asList (1, 9, 2, 6, 4, 3, 5, 7, 8, 0));        
        System.out.printf("Минимальное значение: %d\n", hw.getMin(list));
        System.out.printf("Максимальное значение: %d\n", hw.getMax(list));
        System.out.println("Среднее значение " + hw.getAverage(list));
        System.out.println("Списокк нечетных элементов " + hw.removeNegativeValue(list));

    }

    // Нужно удалить из него четные числа
    /*
     * не понятно почему функция названа так!!! должно быть 
     * removePositiveValue 
     */
    public List<Integer> removeNegativeValue(List<Integer> list){
        
        ArrayList<Integer> negList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                negList.add(i);
            }
        }
        return negList;

    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
          
        return Collections.min(list);
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        return Collections.max(list);
    }

    // Найти среднее значение
    /*
     * Тоже вопросы к заданию
     * среднее редко бывает целочисленным. возврат наверное надо было в double
     * Но iNT указан изнально.
     */

    public Integer getAverage(List<Integer> list){

        int sum = 0;
        for (int num: list) {
            sum = num + sum;
        }

        return ((int) sum/list.size());
        
    }
}
