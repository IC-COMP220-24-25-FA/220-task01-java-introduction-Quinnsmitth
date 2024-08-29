package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }
    @Test
    public void doubleSizeTest(){
        Circle newCircle = new Circle(1);

        newCircle.doubleSize();
        assertEquals(1.41, newCircle.radius,.1);

        newCircle = new Circle(10);
        newCircle.doubleSize();
        assertEquals(14.1, newCircle.radius,.1);

        newCircle.doubleSize();
        newCircle =  new Circle(5);
        newCircle.doubleSize();
        assertEquals(7.05,newCircle.radius,.1);


        

    }
    @Test
    public void longestLineWithinTest(){
        Circle newCircle = new Circle(5);
        assertEquals(10, newCircle.longestLineWithin(),.1);

        newCircle = new Circle(7);
        assertEquals(14,newCircle.longestLineWithin(),.1);

        newCircle = new Circle(4.25);
        assertEquals(8.5,newCircle.longestLineWithin(),.1);


    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }


    
}
