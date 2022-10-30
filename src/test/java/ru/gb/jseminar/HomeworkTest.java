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
        List<Integer> ex = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int exp = 6;
        // что то делаем
        Homework hw = new Homework();
        int expTest = hw.getMax(ex);
        // проверяем
        Assertions.assertEquals(exp,expTest);
    }

    @Test
    void getMinSuccessful() {
        //что то исходное
        List<Integer> ex = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int exp = 1;
        // что то делаем
        Homework hw = new Homework();
        int expTest = hw.getMin(ex);
        // проверяем
        Assertions.assertEquals(exp,expTest);
    }

    @Test
    void removeNegativeValueSuccessful() {
        //что то исходное
        List<Integer> ex = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> exp = new ArrayList<>(Arrays.asList(2,4,6));
        // что то делаем
        Homework hw = new Homework();
        List<Integer> expTest = hw.removeNegativeValue(ex);
        // проверяем
        Assertions.assertIterableEquals(exp,expTest);
    }

    @Test
    void getAverage() {
        //что то исходное
        List<Integer> ex = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        float aver = 3.5f;
        // что то делаем
        Homework hw = new Homework();
        float everTest = hw.getAverage(ex);
        // проверяем
        Assertions.assertEquals(everTest,aver);
    }
}