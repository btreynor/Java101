/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projthreealpha;

import java.util.Scanner;

/**
 *
 * @author brendan
 */
public class ProjThreeAlpha {

    public static void main(String[] args) {
        
        //Input scanner for allowing user input
        Scanner input = new Scanner(System.in);
        
        //declare and initialize the key to the quiz
        int[] keys = {4, 2, 4, 3, 3, 4, 1, 5, 1, 4};
        
        //ask how many students are going to participate
        //allow for user input, this will be the rows
        System.out.println("How many students participated in the quiz?");
        
        int rows = input.nextInt();

        //ask how many questions are going to be on the quiz
        //allow for user input, this will be the columns        
        System.out.println("How many questions are in the quiz?");
        
        int columns = input.nextInt();
        
        
        //initialize the array and sort with user input
        //columns and rows
        int[][] quiz = new int[rows][columns];
        int[][] sort = new int[rows][columns];
        
        //Ask user to input each individual student's answers to the quiz
        System.out.println("Please input each student's answers to the quiz");
        
        //utilize a for-loop to allow for user input answers
        for (int i = 0; i < quiz.length; i++) {
            
            //declare and initialize count variable
            int count = 0;
            
            //for-loop for the user input of quiz answers
            //loop compares answers to key provided
            for ( int j = 0; j < quiz[i].length; j++) {
                quiz[i][j] = input.nextInt();
                if (quiz[i][j] == keys[j])
                count++;
                    sort[i][0] = count;
                }
                
                //display users correctly counted answers after input
                System.out.println("Student's " + i + " correct answers are " + count);
                }
                
                //sort the students in ascending order
                //according to correct answers
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
                
                //display in ascending order students correct answer
                //display corresponding message with matching correct answer
                //display grade with student's correct number of answers 
                //if student received a 10 = A, 9 = A, 8 = B, ...., 5 = F
                System.out.println("--------------------");
                for (int i =0;i<sort.length;i++) {
                System.out.println("Student "+ students[i] + " score listed in ascending order:  " + sort[i][0]);
                
                //switch statement for encouraging statements depending on correct answers
                switch (sort[i][0]) {
                    case 10 -> System.out.println("Great Work! That's a perfect score!");
                    case 9 -> System.out.println("Oooh! So close! Fantastic job!");
                    case 8 -> System.out.println("Very good, keep studying!");
                    case 7 -> System.out.println("Okay, but could use some improvement");
                    case 6 -> System.out.println("You passed!");
                    default -> System.out.println("Major Improvements Necessary");
                }
                
                //if statement for getting student grades
                String letterGrade;
            
                if(sort[i][0] >= 9) {
                letterGrade = "A";
                }
                else if(sort[i][0] == 8) {
                letterGrade = "B";
                }
                else if(sort[i][0] == 7) {
                letterGrade = "C";
                }
                else if(sort[i][0] == 6) {
                letterGrade = "D";
                }
                else { 
                letterGrade = "F";
                }
                System.out.println("Student's grade is a/an " + letterGrade);
                System.out.println("");

                }
            }
        }
