package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if(this.length<0 || this.width <0){
            throw new IllegalArgumentException("One measurement is less than 0 try again.");
        }
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return this.length*this.width;
    }

    public void doubleSize(){
        this.length *= 2;
    }

    public double longestLineWithin(){
        return Math.sqrt((Math.pow(this.length,2)) + (Math.pow(this.width,2)));
    }
    
}
