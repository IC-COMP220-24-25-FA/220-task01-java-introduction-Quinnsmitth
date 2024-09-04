package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0|| third < 0){
            throw new IllegalArgumentException("One of your numbers is less than zero");
        }
        if((first > second) & (first > third)){
            return first;
        }
        if ((second > first) & (second> third)){
            return second;
        }
        if ((third > first) & (third > second)){
            return third;
        }
        if ((first == second)|| (first == third)){
            return first;
        }
        return third;

    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        discountPercent /=100;
        salesTax/=100;
        double newPrice = originalPrice - (originalPrice * discountPercent);
        return newPrice + newPrice*salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld <= 1){
            return true;
        }
        if ((yearsOld >1) & (daysSinceShoesChewed >= 10)){
            return true;
        }
        if(fetchedThePaperToday == true){
            return true;
        }
        return false;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0) {
            return -1;
        }
        int largestNum = numbers.get(0);
        for (int index = 0; index > numbers.size()-1; index ++){
            if(numbers.get(index) == largestNum){
                largestNum = largestNum;
            }
            if(numbers.get(index) > largestNum){
            largestNum = numbers.get(index);
           }
        }
        return largestNum;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0) {
            return -1;
        }
        int largestNum = numbers.get(0);
        int indexOfLargest = 0;

        for (int index = 0; index < numbers.size(); index ++){

            if (numbers.get(index) > largestNum) {
                largestNum = numbers.get(index);
                indexOfLargest = index;
            }

            else if (numbers.get(index) == largestNum) {
                    indexOfLargest = index;
            }

        }
        return indexOfLargest;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        String wordWithMaxOccurences = "";
        int maxOccurences = 0;
        for(int index = 0; index < words.size(); index++){

            String word = words.get(index);
            int occurences = 0;

            for (char ch : word.toCharArray()){

                if (ch == letter){
                    occurences++;
                }
            }
            if(occurences > maxOccurences){
                maxOccurences = occurences;
                wordWithMaxOccurences = word;
            }
        }
        return wordWithMaxOccurences;
    }


}
