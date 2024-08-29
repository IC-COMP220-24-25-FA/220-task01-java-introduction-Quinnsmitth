package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcArea(){
        Rectangle newRectangle  =  new Rectangle(5,5);
        assertEquals(25,newRectangle.calcArea(),.1);

        newRectangle = new Rectangle(1.5,2.2);
        assertEquals(3.3, newRectangle.calcArea(), .1);

        newRectangle = new Rectangle(0, 1);
        assertEquals(0,newRectangle.calcArea(),.1);

    }
}
