package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        // Homework myHomework = new Homework();
        // int size = ThreadLocalRandom.current().nextInt(10, 31);
        // int minVal = 1;
        // int maxVal = 100;     
        // List <Integer> newList = myHomework.createList(size, minVal, maxVal);
        // System.out.println("генерируем список: " + newList);
        // System.out.println("макс: " + myHomework.getMax(newList));
        // System.out.println("мин: " + myHomework.getMin(newList));
        // System.out.println("среднее(без дробной части): " + myHomework.getAverage(newList));
        // newList = myHomework.removeNegativeValue(newList);
        // System.out.println("без четных: " + newList);
        // System.out.println("макс: " + myHomework.getMax(newList));
        // System.out.println("мин: " + myHomework.getMin(newList));
        // System.out.println("среднее(без дробной части): " + myHomework.getAverage(newList));
    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
           
        return list.stream().filter(item -> item % 2 != 0).toList();
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
        int sumElements = 0;
        int count = 0;
        for (int item : list){
            sumElements += item;
            count++;
        }
        if (count == 0)
            return 0;    
        return sumElements / count;
    }

    public List<Integer> createList(int size, int minVal, int maxVal){
        List <Integer> newList = new ArrayList<Integer>();      
        for (int i = 0; i < size; i++) 
            newList.add(ThreadLocalRandom.current().nextInt(minVal, maxVal));
        
        return newList;
    }
}
