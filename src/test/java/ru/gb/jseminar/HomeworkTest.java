package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void removeNegativeValueTest() {
        // source
        List<Integer> expectedInList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> expectedOutList = new ArrayList<>(Arrays.asList(1,3));

        // do
        Homework hw = new Homework();
        List<Integer> actualList = hw.removeNegativeValue(expectedInList);

        // check
        Assertions.assertEquals(expectedOutList,actualList);


    }

    @Test
    void getMinTest() {
        List<Integer> expectedInList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 1;

        Homework hw = new Homework();
        int actual = hw.getMin(expectedInList);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getMaxTest() {
        List<Integer> expectedInList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 4;

        Homework hw = new Homework();
        int actual = hw.getMax(expectedInList);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getAverageTest() {
        List<Integer> expectedInList = new ArrayList<>(Arrays.asList(1,2,3,4));
        double expected = 2.5;

        Homework hw = new Homework();
        double actual = hw.getAverage(expectedInList);

        Assertions.assertEquals(expected,actual);
    }
}