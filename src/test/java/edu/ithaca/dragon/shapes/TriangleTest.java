package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    public void calcAreaTest(){
        Triangle triangle1 = new Triangle(2,2)l;
        assertEquals(2,triangle1.calcArea(),.1);

        triangle1 =  new Triangle(3.5,2);
        assertEquals(7,triangle1.calcArea(),.1);
        
        triangle1 = new Triangle(2.5,3.5);
        assertEquals(4.375, triangle1.calcArea(),.1);

    }
}
