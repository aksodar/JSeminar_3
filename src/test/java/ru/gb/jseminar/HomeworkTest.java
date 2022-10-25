package ru.gb.jseminar;


 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;

 class HomeworkTest {

     @Test
     void getMaxSuccessful() {
         List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         int expected = 5;

         Homework hw = new Homework();
         int actual = hw.getMax(expectedList);

         Assertions.assertEquals(expected, actual);
     }
     @Test
     void removeNegativeValueSuccessful() {
         List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));

         Homework hw = new Homework();
         var actual = hw.removeNegativeValue(expectedList);

         Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
     }
     @Test
     void getMinSuccessful() {
         List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         int expected = 1;

         Homework hw = new Homework();
         int actual = hw.getMin(expectedList);

         Assertions.assertEquals(expected, actual);
     }
     @Test
     void getAverageSuccessful() {
         List<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
         int expected = 7; // 7.5 if double

         Homework hw = new Homework();
         int actual = hw.getAverage(expectedList);

         Assertions.assertEquals(expected, actual);
     }


 }