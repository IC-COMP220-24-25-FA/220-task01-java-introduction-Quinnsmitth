package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

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
    
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        discountPercent /=100;
        salesTax/=100;
        double newPrice = originalPrice - (originalPrice * discountPercent);
        return newPrice + newPrice*salesTax;
    }

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
