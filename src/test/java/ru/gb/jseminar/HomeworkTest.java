package ru.gb.jseminar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HomeworkTest {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(113, 203, 16, 26, 15, 11, 18);
        System.out.println("Список целых чисел: "+arr);
        HomeworkTest newObject = new HomeworkTest();
        System.out.println("Нечетные элементы: "+newObject.removeNegativeValue(arr));
        System.out.println("Элемент с минимальным значением: "+ newObject.getMin(arr));
        System.out.println("Элемент с максимальным значением: "+ newObject.getMax(arr));
        System.out.println("Среднее арифметическое значение элементов = "+ newObject.getAverage(arr));
    }
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> newLst = new ArrayList<>();
        for(int item: list) {
            if (item % 2 != 0) {
                newLst.add(item);
            }
        }
        return newLst;
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
