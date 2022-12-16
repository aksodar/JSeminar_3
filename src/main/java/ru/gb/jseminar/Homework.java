package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class Homework {

    public static void main(String[] args) {
        Homework hw = new Homework();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            int val = rnd.nextInt(100);
            list.add(val);
        }
        System.out.println("Произвольный список чисел : " + list);
        System.out.println("Список без четных чисел :"+ hw.removeNegativeValue(list));
        System.out.println("Минимальное число :"+ hw.getMin(list));
        System.out.println("Максимальное число :"+ hw.getMax(list));
        System.out.println("Среднее значение : "+ hw.getAverage(list));

    }

    public  List<Integer> removeNegativeValue(List<Integer> list){
        for(int i = list.size() - 1; i > -1 ; i--){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        return list;}


    public  Integer getMin(List<Integer> list){
        return Collections.min(list);
    }

    public Integer getMax(List<Integer> list){
        return Collections.max(list);
    }


    public Integer getAverage(List<Integer> list){
        int average = 0;
        if (list.size() > 0){
            {
                int sum = 0;
                for (int item : list) {
                    sum += item;
                }
                average = sum/list.size();
            }

        }
        return average;
    }
}

