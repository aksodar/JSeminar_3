package ru.gb.jseminar;

import java.util.*;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 2, 17, 10, 9, 21, 13, 8, 4));
        System.out.print("Исходный список - ");
        System.out.println(list);
        System.out.print("Список без четных чисел - ");
        System.out.println(hw.removeNegativeValue(list));
        System.out.println(String.format("Минимальное значение списка - %d", hw.getMin(list)));
        System.out.println(String.format("Максимальное значение списка - %d", hw.getMax(list)));
        System.out.println(String.format("Среднее значение списка - %.2f", hw.getAverage(list)));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) iter.remove();
        }
        return list;
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
    public float getAverage(List<Integer> list){
        float sum = 0;
        for (int i: list){
            sum += i;
        }

        return sum / (list.size());
    }
}
