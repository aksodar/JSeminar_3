package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void removeNegativeValue() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3));

        Homework hw = new Homework();
        List<Integer> actual = hw.removeNegativeValue(expectedList);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getMinSuccesfull() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 1;

        Homework hw = new Homework();
        int actual = hw.getMin(expectedList);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getMaxSuccesfull() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 4;

        Homework hw = new Homework();
        int actual = hw.getMax(expectedList);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getAverage() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        double expected = 2.5 ;

        Homework hw = new Homework();
        double actual = hw.getAverage(expectedList);

        Assertions.assertEquals(expected,actual);
    }
}