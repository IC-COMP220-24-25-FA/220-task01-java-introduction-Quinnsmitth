package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.Scanner;
public class ShapeMain {
    
    public static void main(String[] args){
        ArrayList<Rectangle> rectList = new ArrayList<>();
        Rectangle rect1 = new Rectangle(1,1);
        Rectangle rect2 = new Rectangle(1,2);
        Rectangle rect3 = new Rectangle(1,3);
        Rectangle rect4 = new Rectangle(1,4);
        Rectangle rect5 = new Rectangle(1,5);
        rectList.add(rect1);
        rectList.add(rect2);
        rectList.add(rect3);
        rectList.add(rect4);
        rectList.add(rect5);
            for(int index = 0; index < rectList.size(); index++){
                System.out.println(rectList.get(index));
            }
            Scanner scrn = new Scanner(System.in);
            System.out.println("Pick a rectangle you want to double:");
            int answer = scrn.nextInt();
            scrn.close();

            if (answer == 1 ){
               rect1.doubleSize();
            }
            if (answer == 2 ){
                rect2.doubleSize();
             }
            if (answer == 3 ){
            rect3.doubleSize();
            }
            if (answer == 4){
                rect4.doubleSize();
            }
            if (answer == 5 ){
            rect5.doubleSize();
            }
          
            for(int index = 0; index < rectList.size(); index++){
                System.out.println(rectList.get(index));
            }
        
            
        


        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
    }
}
