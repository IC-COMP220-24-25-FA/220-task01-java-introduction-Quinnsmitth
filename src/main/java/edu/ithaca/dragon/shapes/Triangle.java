package edu.ithaca.dragon.shapes;

public class Triangle {
    private double height;
    private double base;

    public Triangle(double baseIn,double heightIn){
        height = heightIn;
        base = baseIn;

    }
    public double calcArea(){
        return (height*base)*.5;
    }
    public void doubleSize(){
        
    }

}
