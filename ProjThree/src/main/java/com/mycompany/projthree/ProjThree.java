/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projthree;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ProjThree {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] keys = {4, 2, 4, 3, 3, 4, 1, 5, 1, 4};
        
        
        System.out.println("How many students participated in the quiz?");
        
        int rows = input.nextInt();
        
        System.out.println("How many questions are in the quiz?");
        
        int columns = input.nextInt();
        
        int[][] quiz = new int[rows][columns];
        int[][] sort = new int[rows][columns];
        
        System.out.println("Please input each student's answers to the quiz");
        
        for (int i = 0; i < quiz.length; i++) {
        
            int count = 0;
            
            
            for ( int j = 0; j < quiz[i].length; j++) {
                quiz[i][j] = input.nextInt();
                if (quiz[i][j] == keys[j])
                count++;
                    sort[i][0] = count;
                }
            
                System.out.println("Student's " + i + " correct answers are " + count);
                
                String letterGrade;
                
                if(count >= 9) {
                letterGrade = "A";
                }
                else if(count == 8) {
                letterGrade = "B";
                }
                else if(count == 7) {
                letterGrade = "C";
                }
                else if(count == 6) {
                letterGrade = "D";
                }
                else { 
                letterGrade = "F";
                }
                System.out.println("Student's " + i + " grade is a/an " + letterGrade);

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
                System.out.println("--------------------");
                for (int i =0;i<sort.length;i++) {
                System.out.println();
                System.out.println("Student "+ students[i] + " score listed in order:  " + sort[i][0]);
                
            switch (sort[i][0]) {
                case 10 -> System.out.println("Great Work! That's a perfect score!");
                case 9 -> System.out.println("Oooh! So close! Fantastic job!");
                case 8 -> System.out.println("Very good, keep studying!");
                case 7 -> System.out.println("Okay, but could use some improvement");
                case 6 -> System.out.println("You passed!");
                default -> System.out.println("Major Improvements Necessary");
            }
  }
}
}    
