package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeworkTest {

    @Test
    void removeNegativeValueSuccessful(){
        List<Integer> expectidList = new ArrayList<>(Arrays.asList(1, -2, 3, 4));
        List <Integer> expect = List.of(1, 3); 

        Homework homework = new Homework();
        List <Integer> actual = homework.removeNegativeValue(expectidList);

        Assertions.assertEquals(expect, actual);
    }
     void getMinSuccessful (){
        List<Integer> expectidList = new ArrayList<>(Arrays.asList(1, -2, 3, 4));
        int expect = -2;

        Homework homework = new Homework();
        int actual = homework.getMin(expectidList);

        Assertions.assertEquals(expect, actual);

     }

     void getMaxSuccessful (){
        List<Integer> expectidList = new ArrayList<>(Arrays.asList(1, -2, 3, 4));
        int expect = 4;

        Homework homework = new Homework();
        int actual = homework.getMax(expectidList);

        Assertions.assertEquals(expect, actual);

     }

     void getAverageSuccessful (){
        List<Integer> expectidList = new ArrayList<>(Arrays.asList(1, -2, 3, 4));
        int expect = 1;

        Homework homework = new Homework();
        int actual = homework.getAverage(expectidList);

        Assertions.assertEquals(expect, actual);

     }

}