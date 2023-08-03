/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author tanya
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    //Set the size of random numbers being used
    //As well as the range of numbers to use with
    //We use 11 because otherwise the range will only reach 9
    static final int SIZE = 100;
    static final int RANGE = 11;
    
    public static void main(String[] args) {

        int[] randomNumbers = new int[SIZE];
        int[] occurrence = new int[RANGE];
        
        //Generate random numbers 1-10
        //Ensure 0 is not in the matrix
        for (int i = 0; i < randomNumbers.length; i++) {
            int num = (int)(Math.random() * RANGE);
            if(num == 0){
                num = num + 1;
            }  
            randomNumbers[i] = num;
            occurrence[num]++;
                  
        }
        
        //Put the random numbers in a matrix
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
            if ((i + 1) % 10 == 0) System.out.println("");
        }
        
        //Use a for loop to print out the occurence
        //Have a space for neatness
        System.out.println("");
        for (int i = 1; i < occurrence.length; i++) {
            System.out.println("Occurrences for "+ i + " = " + occurrence[i]);
        }
    }

    //Method for printing out the array
    public static void printArray(int[] array, int matrixNumbers) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) % matrixNumbers == 0) System.out.println("");
        }
    }
}
