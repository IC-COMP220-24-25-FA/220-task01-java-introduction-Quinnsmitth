package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.shapes.Rectangle;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(52, FunctionPractice.calcSalePrice(100,50,4));
        assertEquals(18.9, FunctionPractice.calcSalePrice(20,10,5));
        assertEquals(100.7, FunctionPractice.calcSalePrice(100,5,6));
        assertEquals(0, FunctionPractice.calcSalePrice(100,100,1));
        
    }
    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(10,100,true));
        assertTrue(FunctionPractice.isGoodDog(1,1,false));
        assertFalse(FunctionPractice.isGoodDog(2,1,false));
        assertFalse(FunctionPractice.isGoodDog(4,1,false));
    }
    @Test
    public void findFirstLargest(){
        ArrayList<Integer> list1 = new ArrayList<>(); 
        list1.add(1);
        list1.add(3);
        assertEquals(1,FunctionPractice.findFirstLargest(list1));
        list1.add(3);
        assertEquals(1,FunctionPractice.findFirstLargest(list1));
        list1.add(3);
        assertEquals(1,FunctionPractice.findFirstLargest(list1));
        list1 = new ArrayList<>();
        assertEquals(-1,FunctionPractice.findFirstLargest(list1));

    }
    @Test
    public void findLastLargest(){
        ArrayList<Integer> list1 = new ArrayList<>(); 
        list1.add(1);
        list1.add(1);
        assertEquals(1,FunctionPractice.findLastLargest(list1));
        list1.add(1);
        assertEquals(2,FunctionPractice.findLastLargest(list1));
        list1.add(1);
        assertEquals(3,FunctionPractice.findLastLargest(list1));
        list1 = new ArrayList<>();
        assertEquals(-1,FunctionPractice.findLastLargest(list1));
    }
    @Test
    public void findFirstMostOccurencesOfLetter(){
        List<String> words = new ArrayList<>();
        words.add("hi");
        words.add("hello");
        words.add("high");
        assertEquals("high",FunctionPractice.findFirstMostOccurencesOfLetter(words, 'h'));



    }
    
}
