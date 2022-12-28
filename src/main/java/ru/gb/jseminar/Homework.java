package ru.gb.jseminar;

import java.util.*;
import java.util.stream.IntStream;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(Arrays.asList( 9, 2, 6, 4, 3, 5, 7, 8, 11));
        int lst[] = {  9, 2, 6, 4, 3, 5, 7, 8, 11};
        double sum = IntStream.of(lst).sum();
        double z =(sum / lst.length);
        System.out.printf("Average value: %.1f",z);
        System.out.println();

        Homework testObject = new Homework();

        System.out.println("List of odd numbers: " + testObject.removeEvenValue(list));
        System.out.println("Min value: " + testObject.getMin(list));
        System.out.println("Max value: " + testObject.getMax(list));
        System.out.println("Average of odd values: " + testObject.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public  List<Integer> removeEvenValue(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number % 2 == 0) {
                it.remove();
            }
        }
        return list;
    }

    //    Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int m = Collections.min(list);
        return m;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int m = Collections.max(list);
        return m;
    }

    // Найти среднее значение
    public double getAverage(List<Integer> list){
        float sum = 0;
        for(int s : list){
            sum+=s;
        }

        return  sum / list.size();
    }
}
