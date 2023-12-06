package com.example;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6},{7,8,9}};
        int count = 0;
        for(int i = 0; i < array.length; i++){
           count += array[i][i]; 
           System.out.println(count);
        }
        // Exercise 1: Initialize and Print a 2D Array
        // TODO: Initialize a 2D array of integers and print its contents in a matrix form.
    }


    // Exercise 2: Find the Maximum Value in a 2D Array

    public static int findMaximumValue(int[][] array) {
       int maxnum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > maxnum){
                    maxnum = array[i][j];
                }
            }
        }
        // TODO: Implement the logic to find the maximum value in the 2D array.
        return maxnum; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int i=0; i <array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if(array[i][j]==value){
                    return true;
                }
            }
        }
        // TODO: Implement the logic to check if the 2D array contains the specified value.
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        int sum=0;
        int counter = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                sum+=array[i][j];
                counter++;
            }
        }
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
        return sum/counter; // Placeholder return value
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i][i];
        }
        // TODO: Calculate and return the sum of diagonal elements in the 2D array.
        return sum; // Placeholder return value
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        int counter = 0 ;
        for (int i=0; i<array.length; i++){
            counter += array[i].length;
        }
        int newCounter=0;
        int[] flattenedArray=new int [counter];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                flattenedArray[newCounter]=array[i][j];
                newCounter++;
            }
        }
        // TODO: Implement the logic to flatten the 2D array into a 1D array.
        return flattenedArray; // Placeholder return value
    }
}
