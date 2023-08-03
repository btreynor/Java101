/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayhwhelp;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ArrayHWHelp {

public static void returnIndex(double[] array) {
double smallestNumberIndex = 0;
double smallestNumber = array[0];

double n;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of elements you want to store");

n = sc.nextDouble();
array = new double[10];

for(int i=0; i<n; i++){
    array[i]=sc.nextDouble();
}

for(int i = 0; i<array.length; i++){          
        if (array[i] <= smallestNumber) {
            smallestNumber = array[i];
            smallestNumberIndex = i;
        }
        }
System.out.println("The smallest number index is " + smallestNumberIndex);
    }
}