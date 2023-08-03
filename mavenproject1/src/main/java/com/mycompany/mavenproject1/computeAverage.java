/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class computeAverage {
 public static void main(String[] args) {

    int counter = 0;
    int input = 0;
    double sum = 0;
    double average;

    System.out.print("Enter a series of integers or press 0 to quit: ");
    
    //set up your scanner//
    Scanner in = new Scanner(System.in);

    //do the while loop//
    while ((input = in.nextInt()) != 0) {

        if (input != 0)
            sum = input + sum;
           counter++;
        }

    if (counter > 0) {

        average = sum / counter;

        System.out.println("Total number of integers entered is " + counter);

        System.out.println("The average is: " + average);
    
    } else {
            System.out.println("No data was entered.");
        }
    }
}

