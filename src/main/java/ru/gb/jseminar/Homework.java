package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

        List<Integer> myList = createRandomList(5);
        for(int i = 0 ; i < myList.size(); i++){
            System.out.println(myList.get(i));
        } 

        removeNegativeValue(myList);

        myList = createRandomList(5);
        for(int i = 0 ; i < myList.size(); i++){
            System.out.println(myList.get(i));
        } 
        getMin(myList);

        getMax(myList);

        getAverage(myList);

    }

    public static ArrayList<Integer> createRandomList(int sizeParameter) {

    ArrayList<Integer> setIntegerList = new ArrayList<Integer>(sizeParameter);

    Random randomHelper = new Random();
    
    for (int x = 0; x < sizeParameter; x++)
    {
        setIntegerList.add(randomHelper.nextInt(10));
    }  
    
    return setIntegerList;
}

    // Нужно удалить из него четные числа
    public static List<Integer> removeNegativeValue(List<Integer> list){

        for (int i = 0; i < list.size(); i++){ 
                
            int even = list.get(i) % 2; 

             if (even == 0) {
                 list.remove(i);
             }    
         }

         System.out.println("Список без четных чисел: " + list);

        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){

        int min = list.get(0);
        
        for (Integer i: list) {
            if(i < min) 
               min = i;
        }
        System.out.println("минимальное число: " + min);
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){

        int max = list.get(0);

        for (Integer i: list) {
            if(i > max) 
               max = i;
        }

        System.out.println("максимальное число: " + max);
        return max;
    }

    // Найти среднее значение
    public static int getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        
        int average = sum / list.size();

         System.out.println("Среднее значение: " + average);
         return average;
    }
}