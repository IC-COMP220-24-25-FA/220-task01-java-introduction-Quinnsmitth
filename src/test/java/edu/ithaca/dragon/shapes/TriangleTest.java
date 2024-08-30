package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle triangle1 = new Triangle(2,2);
        assertEquals(2,triangle1.calcArea(),.1);

        triangle1 =  new Triangle(3.5,2);
        assertEquals(3.5,triangle1.calcArea(),.1);
        
        triangle1 = new Triangle(2.5,3.5);
        assertEquals(4.375, triangle1.calcArea(),.1);

    }
    @Test
    public void doubleSize(){
        Triangle triangle1 = new Triangle(2,4);
        triangle1.doubleSize();
        assertEquals(8,triangle1.calcArea(),.1);

        triangle1 = new Triangle(2.5,2);
        triangle1.doubleSize();
        assertEquals(5,triangle1.calcArea(),.1);

        triangle1 = new Triangle(2.1,4.3);
        triangle1.doubleSize();
        assertEquals(9.03,triangle1.calcArea(),.1);

    }
}
