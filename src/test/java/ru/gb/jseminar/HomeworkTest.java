package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTest {

    @Test
    void removeNegativeValueSuccessful() {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> expectedList2 = new ArrayList<>(Arrays.asList(1,3,5));

        Homework homework = new Homework();
        List<Integer> actual = homework.removeNegativeValue(expectedList);

        Assertions.assertEquals(expectedList2, actual);
    }

    @Test
    void getMixSuccessful() {
        //что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int expected = 1;

        //что-то делаем
        Homework homework = new Homework();
        int actual = homework.getMin(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxSuccessful() {
        //что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int expected = 5;

        //что-то делаем
        Homework homework = new Homework();
        int actual = homework.getMax(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageSuccessful() {
        //что-то исходное
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        double expected = 3.0;

        //что-то делаем
        Homework homework = new Homework();
        double actual = homework.getAverage(expectedList);

        // проверяем
        Assertions.assertEquals(expected, actual);
    }


}