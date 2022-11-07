package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HomeworkTest {

    @Test
    void getMaxSuccessful() {
        // что то исходное
        List<Integer> expectedArr = new ArrayList<>(Arrays.asList(2,1,8,5,3));
        int expected = 8;

        // что то делаем
        Homework homework = new Homework();
        int actual = homework.getMax(expectedArr);

        // проверяем
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getMin() {
        List<Integer> expectedArr = new ArrayList<>(Arrays.asList(2,1,8,5,3));
        int expected = 1;

        Homework homework = new Homework();
        int actual = homework.getMin(expectedArr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverage() {
        List<Integer> expectedArr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        double expected = 3.5;

        Homework homework = new Homework();
        double actual = homework.getAverage(expectedArr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeNegativeValue() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,4,6,8,10,1,3));
        List<Integer> expectedArray = new ArrayList<>(Arrays.asList(1,3));

        Homework homework = new Homework();
        List<Integer> actualArr = homework.removeNegativeValue(arr);

        Assertions.assertEquals(actualArr, expectedArray);
    }
}