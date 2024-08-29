package edu.ithaca.dragon.shapes;

public class Circle {
    public double radius;
    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= Math.sqrt(2);
        
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return this.radius*2;
    }
}
