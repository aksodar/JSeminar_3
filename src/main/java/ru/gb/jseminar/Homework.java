package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(String.format("Максимальное значение - %d", hw.getMax(list)));
        System.out.println(String.format("Минимальное значение - %d", hw.getMin(list)));
        System.out.println("Список нечетных элекментов: ");
        System.out.println(hw.removeNegativeValue(list));
        System.out.println(String.format("Среднее значение - %.2f", hw.getAverage(list)));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()){
            int el = iter.next();
            if (el % 2 != 0){
                iter.remove();
            }
        }
        return list;
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){
        int min = Collections.min(list);
        return min;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
        int max = Collections.max(list);
        return max;
    }

    // Найти среднее значение
    public float getAverage(List<Integer> list){
        float sum = 0;
        for (int item: list) {
            sum += item;
        }
        float aver = sum/ list.size();

        return aver;
    }
}
