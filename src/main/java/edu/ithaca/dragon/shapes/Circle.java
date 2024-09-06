package edu.ithaca.dragon.shapes;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        if (radius < 0){
            throw new IllegalArgumentException("Make radius Greater than 0");
        }
        this.radius = radius;
    }

    public double calcArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    public void doubleSize(){
        this.radius *= Math.sqrt(2);
        
    }

    public double longestLineWithin(){
        return this.radius*2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return " Circle Area: "+this.calcArea()+"    Longest Line Within: "+this.longestLineWithin();
    }
}
