package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        Homework hw = new Homework();

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(543);
        num.add(111112);
        num.add(124);
        num.add(976543);
        num.add(44);
        num.add(6245);
        num.add(9);
        num.add(3);
        num.add(98);

        System.out.println(hw.removeNegativeValue(num));
        System.out.println(hw.getMax(num));
        System.out.println(hw.getMin(num));
        System.out.println(hw.getAverage(num));
    }

    // Удалить четные числа
    public List<Integer> removeNegativeValue(List<Integer> list) {
        ArrayList<Integer> not_even = new ArrayList<>();
        for (int i : list) {
            if (i % 2 != 0) {
                not_even.add(i);
            }
        }
        return not_even;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list) {

        return Collections.max(list);
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list) {

        return Collections.min(list);
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list) {
        Integer summ = list.stream().reduce(0, (a, b) -> a + b);
        return summ / 2;
    }
}
