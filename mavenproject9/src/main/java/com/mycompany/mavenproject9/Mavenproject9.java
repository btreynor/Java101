/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class Mavenproject9 {

  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int[] keys = {4, 2, 4, 3, 3, 4, 1, 5, 1, 4};
    System.out.println("Fill in the eight student's ans" + "wers to 10 questions");
    int[][] list = new int[8][10];
    int[][] sort = new int[8][1];
    
    
    for (int i =0;i<list.length;i++) {
        int count =0;
        for (int j =0;j<list[i].length;j++) { 
        list[i][j] = scan.nextInt();
        
        if( list[i][j]!=(keys[j])) {
        } else {
            count++;
            sort[i][0] = count;
            
        } 
      }
    }
  int[] students = {0, 1, 2, 3, 4, 5, 6, 7};
  
  
  
  for (int i =0;i<sort.length;i++) {
      
      for (int j=0;j<sort.length-1;j++) {
          
        if (sort[j][0] > sort[j+1][0]) {
            
          int temp = sort[j][0];          
          sort[j][0] = sort[j+1][0];
          sort[j+1][0] = temp;
          
          int temp2 = students[j];
          students[j] = students[j+1];
          students[j+1]= temp2;
        }
      }
    }
  
    for (int i =0;i<sort.length;i++) {
      System.out.println("Student "+ students[i]+" answered " + sort[i][0] + " questions correctly on the quiz");
    }
    for (int i=0; i<sort.length;i++) {
        
    }
  }
}


    

