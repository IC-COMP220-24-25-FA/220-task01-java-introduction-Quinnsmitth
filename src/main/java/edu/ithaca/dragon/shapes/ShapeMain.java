package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.Scanner;
public class ShapeMain {
    
    public static void main(String[] args){
        ArrayList<Shape> shapeList = new ArrayList<>();
        int max = 3;
        int min = 1;
        int x  = 0;

        while(x > 10){
            int num =  (int) Math.floor(Math.random() * (max - min + 1) + min);

            if (num == 1){
                Circle circle = new Circle((int) Math.floor(Math.random() * (100 - 1 + 1) + 1));
                shapeList.add(circle);
            }
            if (num == 2){
                Rectangle rectangle = new Rectangle((int) Math.floor(Math.random() * (100 - 1 + 1) + 1), (int) Math.floor(Math.random() * (100 - 1 + 1) + 1));
                shapeList.add(rectangle);
            }
            if (num == 3){
                Triangle triangle = new Triangle((int) Math.floor(Math.random() * (100 - 1 + 1) + 1), (int) Math.floor(Math.random() * (100 - 1 + 1) + 1));
                shapeList.add(triangle);
                System.out.println(triangle);
            }
        }

        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
                // Scanner scrn = new Scanner(System.in);
                // // System.out.println("Pick a rectangle you want to double:");
                // // int answer = scrn.nextInt();
                // // scrn.close();
    
            
        


        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
    }
}
