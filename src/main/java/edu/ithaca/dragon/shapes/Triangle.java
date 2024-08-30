package edu.ithaca.dragon.shapes;

public class Triangle {
    private double height;
    private double base;

    public Triangle(double baseIn,double heightIn){
        if ((heightIn < 0 )|| (baseIn < 0)){
            throw new IllegalArgumentException("Base or Height Value is Less than 0.");
        }
        height = heightIn;
        base = baseIn;

    }

    public double calcArea(){
        return (height*base)*.5;
    }

    public void doubleSize(){
        height*=2;
    }

    public double longestLineWithin(){
       return Math.sqrt((Math.pow(base,2)) + (Math.pow(height,2)));
    }

}
