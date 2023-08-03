/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject11;



/**
 *
 * @author tanya
 */
public class Mavenproject11 { 
public static void main(String[] args) {     
    int array[][] = new int[5][10];   
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = ((int) (Math.random() * 100) + 10);
            System.out.print(array[i][j] + " ");
        } 
        System.out.println();
    }
}
}


                
        
     
    

