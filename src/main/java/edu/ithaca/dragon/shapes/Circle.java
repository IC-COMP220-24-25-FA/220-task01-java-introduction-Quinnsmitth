package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        if (radius < 0){
            throw new IllegalArgumentException("Make radius Greater than 0");
        }
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
