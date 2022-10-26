package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void getMaxSuccessful() {
        //что то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 4;

        //что то делаем
        Homework HW3 = new Homework();
        int actual = HW3.getMax(expectedList);

        //проверяем
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void removeNegativeValueSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,3));

        Homework HW3 = new Homework();
        List<Integer> actual = HW3.removeNegativeValue(expectedList);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        int expected = 1;

        Homework HW3 = new Homework();
        int actual = HW3.getMin(expectedList);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getAverageSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4));
        double expected = 2.5;

        Homework HW3 = new Homework();
        double actual = HW3.getAverage(expectedList);

        Assertions.assertEquals(expected,actual);
    }
}