package ru.gb.jseminar;
import java.util.stream.IntStream;
import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Homework homeObject = new Homework();
        //Удаление четных числе
        //System.out.println(homeObject.removeNegativeValue(list));
        //Находит минимальное значение
        //System.out.println(homeObject.getMin(list));
        //Находит максимальное значение
        //System.out.println(homeObject.getMax(list));
        //Находит среднее арифметическое
        //System.out.println(homeObject.getAverage(list));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        list.removeIf(n -> (n % 2 == 0));
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int a = Collections.min(list);
        return a;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int b = Collections.max(list);
        return b;
    }

    // Найти среднее значение
    public Double getAverage(List<Integer> list){
        double sum = 0;
        for(int i=0; i<list.size(); i++) {
            sum+=list.get(i);
        }
        return sum/list.size();
    }
}