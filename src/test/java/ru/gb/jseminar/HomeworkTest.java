package ru.gb.jseminar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

class HomeworkTest {
    @org.junit.jupiter.api.Test
    void  getMaxSuccessful(){
        //что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 4;

        // что-то делаем
        Homework homework = new Homework();
        int actual = homework.getMax(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void removeNegativeValueSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3));;

        Homework homework = new Homework();
        List<Integer> actual = homework.removeNegativeValue(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void  getMinSuccessful(){

        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 1;

        Homework homework = new Homework();
        int actual = homework.getMin(expectedList);

        Assertions.assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void getAverageSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        double expected = 2.5;

        Homework homework = new Homework();
        double actual = homework.getAverage(expectedList);

        Assertions.assertEquals(expected, actual);
    }
}