package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 4, 8, 7, 6, 1, 8, 3, 6));
        System.out.println("Заданный список чисел: " + numbers);
        Homework self = new Homework();
        System.out.println("Нечётные числа: " + self.removeNegativeValue(numbers));
        System.out.println("Минимальное значение: " + self.getMin(numbers));
        System.out.println("Максимальное значение: " + self.getMax(numbers));
        System.out.println("Среднее значение: " + self.getAverage(numbers));

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> evenNumbers = new ArrayList<>();
        for (int item: list
             ) {
            if (item % 2 == 1) {
                evenNumbers.add(item);
            }
        }
//        System.out.println(evenNumbers);
        return evenNumbers;
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
    public Integer getAverage(List<Integer> list){
        int sum = list.stream().reduce(Integer::sum).get();
        int res = sum / list.size();
//        System.out.println(sum);
        return res;
    }
}
