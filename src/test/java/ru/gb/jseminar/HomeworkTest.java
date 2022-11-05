package ru.gb.jseminar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class HomeworkTest {
    
    
    @Test
    void getMaxSuccessfull() {
        //что-то исходное               
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int expected = 4;
        // что-то делаем
        Homework hm = new Homework();
        int actual = hm.getMax(expectedList);
        //проверяем
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void getMinSuccessfull() {
        //что-то исходное               
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int expected = 1;
        // что-то делаем
        Homework hm = new Homework();
        int actual = hm.getMin(expectedList);
        //проверяем
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void removeNegativeValueSuccessfull() {
        //что-то исходное               
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3));
        // что-то делаем
        Homework hm = new Homework();
        List <Integer> actual = hm.removeNegativeValue(expectedList);
        //проверяем
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void getAverageSuccessfull() {
        //что-то исходное               
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        double expected = 2.5;
        // что-то делаем
        Homework hm = new Homework();
        double actual = hm.getAverage(expectedList);
        //проверяем
        Assertions.assertEquals(expected, actual);
    }

}