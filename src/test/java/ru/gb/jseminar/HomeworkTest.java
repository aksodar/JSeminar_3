package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @org.junit.jupiter.api.Test
    void removeNegativeValueText() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer>expected=new ArrayList<>(Arrays.asList(1,3));

        Homework homework= new Homework();
        List<Integer>actual;
        actual=homework.removeNegativeValue(expectedList);

        Assertions.assertIterableEquals(expected,actual);
    }

    @Test
    void getMinText() {
        List<Integer>expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer expected=1;

        Homework homework= new Homework();
        int actual=homework.getMin(expectedList);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getMaxText() {
        List<Integer>expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer expected=4;

        Homework homework= new Homework();
        int actual=homework.getMax(expectedList);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getAverageText() {
        List<Integer>expectedList = new ArrayList<>(Arrays.asList(1,2,3,2));
        double expected=2;

        Homework homework= new Homework();
        double actual=homework.getAverage(expectedList);

        Assertions.assertEquals(expected,actual);
    }
}