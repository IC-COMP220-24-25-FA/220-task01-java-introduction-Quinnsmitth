package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle newRectangle  =  new Rectangle(5,5);
        assertEquals(25,newRectangle.calcArea(),.1);

        newRectangle = new Rectangle(1.5,2.2);
        assertEquals(3.3, newRectangle.calcArea(), .1);

        newRectangle = new Rectangle(0, 1);
        assertEquals(0,newRectangle.calcArea(),.1);

    }
    @Test 
    public void doubleSizeTest(){
        Rectangle newRectangle = new Rectangle(2,10);
        newRectangle.doubleSize();
        assertEquals(40,newRectangle.calcArea(),.1);

        newRectangle = new Rectangle(.5,8);
        newRectangle.doubleSize();
        assertEquals(8,newRectangle.calcArea(),.1);

        newRectangle = new Rectangle(10,4);
        newRectangle.doubleSize();
        assertEquals(80,newRectangle.calcArea(),.1);
    }
    @Test
    public void longestLineWithinTest(){
        Rectangle newRectangle = new Rectangle(2,2);
        assertEquals(2.82842712475,newRectangle.longestLineWithin(),.1);

        newRectangle = new Rectangle(4,6);
        assertEquals(7.21110255093,newRectangle.longestLineWithin(),.1);

        newRectangle = new Rectangle(4.2,7.8);
        assertEquals(8.8588938,newRectangle.longestLineWithin(),.1);


    }
    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5,-5));
    }
}
