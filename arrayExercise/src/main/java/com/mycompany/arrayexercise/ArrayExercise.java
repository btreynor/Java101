/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayexercise;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ArrayExercise {
public static void main(String[] args) {   
    Scanner input = new Scanner(System.in);
    double sum = 0;
    int smallestNumberIndex = 0;
    int maximumNumberIndex = 0;
    
    final int NUMBER_OF_ELEMENTS = 10;
    double[] array = new double[NUMBER_OF_ELEMENTS];
    double maximumNumber;
    double minimumNumber;
    
    for(int i = 0; i<array.length; i++){
        System.out.println("Enter a number");
        array[i] = input.nextDouble();
    }
    
        maximumNumber = array[0];
        minimumNumber = array[0];
        
        for(int i = 0; i<array.length; i++){
        sum += array[i];
        if (array[i] >= maximumNumber)
            maximumNumber = array[i];
            maximumNumberIndex = i;
        if (array[i] <= minimumNumber) {
            minimumNumber = array[i];
            smallestNumberIndex = i;
        }
        }
        double mean = sum / array.length;
        System.out.println("The mean is " + mean);
        System.out.println("The maximum number is " + maximumNumber);
        System.out.println("The index of the smallest number is " + smallestNumberIndex);
        System.out.println("The index of the largest number is " + maximumNumberIndex);
    }
}
