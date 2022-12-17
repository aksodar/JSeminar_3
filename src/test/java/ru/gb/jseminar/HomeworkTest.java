package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HomeworkTest {
    public static void main(String[] args) {
        List<Integer> roll = Arrays.asList(12, 8, 3, 6, 1, 13, 5);
        System.out.println("Исходный список целых чисел: "+roll);
        Task1 newObject1 = new Task1();
        System.out.println("Нечетные элементы списка: "+newObject1.removeEvenValue(roll));
        System.out.println("Элемент списка с минимальным значением: "+newObject1.getMin(roll));
        System.out.println("Элемент списка с максимальным значением: "+newObject1.getMax(roll));
        System.out.println("Среднее арифметическое элементов списка = "+newObject1.getAverage(roll));
    }
    public List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for(int item: list) {
            if (item % 2 != 0) {
                newList.add(item);
            }
        }
        return newList;
    }
    public Integer getMin(List<Integer> list){
        return Collections.min(list);
    }
    public Integer getMax(List<Integer> list){
        return Collections.max(list);
    }
    public Double getAverage(List<Integer> list){
        return list.stream().mapToDouble(val -> val).average().orElse(0.0);
    }
}
