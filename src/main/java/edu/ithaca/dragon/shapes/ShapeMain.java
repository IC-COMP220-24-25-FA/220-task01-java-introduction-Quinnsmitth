package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ShapeMain {
    
    public static void main(String[] args){

        List<Shape> shapeList = new ArrayList<>();

        int max = 3;
        int min = 1;
        int x  = 0;

        while(x < 10){
            double num =   Math.floor(Math.random() * (max - min + 1) + min);

            if (num == 1){
                Circle circle = new Circle( Math.floor(Math.random() * (100 - 1 + 1) + 1));
                shapeList.add(circle);
                x++;
            }
            else if (num == 2){
                Rectangle rectangle = new Rectangle((Math.floor(Math.random() * (100 - 1 + 1) + 1)), Math.floor(Math.random() * (100 - 1 + 1) + 1));
                shapeList.add(rectangle);
                x++;
            }
            else if (num == 3){
                Triangle triangle = new Triangle((Math.floor(Math.random() * (100 - 1 + 1) + 1)), Math.floor(Math.random() * (100 - 1 + 1) + 1));
                shapeList.add(triangle);
                x++;
            }
        }
        for (Shape aShape: shapeList) {
            System.out.println(aShape);

        }
        System.out.println("________________________________________________________");

        int i = 0;
        while(i < shapeList.size()){
            shapeList.get(i).doubleSize();
            i++;
        }
        for(Shape aShape:shapeList){
            System.out.println(aShape);
        }
        
    
}
}