/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectone;

/**
 *
 * @author tanya
 */

import java.util.Scanner;
import java.util.Random;

public class ProjectOne {
   public static void main(String [] args){
   
   
      Scanner scan = new Scanner(System.in);
       //Allows user input for the number of questions
     
      System.out.println("Enter the number of questions you want to attempt in the quiz: ");
      int numQuest = scan.nextInt();
      System.out.println("Quiz Questions " + numQuest);
     
     
      //ALlows user input for the type of quiz
      System.out.println("PICK A QUIZ: ADDITION(1), SUBTRACTION(2), MULTIPLICATION(3), DIVISION(4) OR REMAINDER(5)? ");
      int choice = scan.nextInt();
      
      int correctCount = 0; //amount of correct answers
      int count = 0; //counting the number of questions 
      String output = ""; //output string is initially empty
     
     
     
      switch(choice) {
         case 1:
            System.out.println("Addition Quiz");
            int number = scan.nextInt();
              while(numQuest < number) {
              int number1 = (int)(Math.random()*10);
              int number2 = (int)(Math.random()*10);
              
              System.out.println("What is: " + number1 + "+" + number2 + "=");
              int answer = scan.nextInt();
              //grade the answer and display the result
              if (number1 - number2 == answer) {
                  System.out.println("You are correct");
                  correctCount++;
              }
              else
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
               
               // Increase the count
               count++;

               output += "\n" + number1 + "-" + number2 + "=" + answer + 
                ((number1 - number2 == answer) ? " correct" : " wrong");
              
                }
                break;

         case 2:
            System.out.println("Subtraction Quiz");
              while(numQuest < count) {
                  //generate two random numbers
              int number1 = (int)(Math.random()*10);
              int number2 = (int)(Math.random()*10);
              
              //if number 1 < number 2, swap number1 with number2
              //for subtraction purposes
              if (number1 < number2) {
                  int temp = number1;
                  number1 = number2;
                  number2 = temp;
              }
              
              //prompt the student to answer the question
              System.out.println("What is: " + number1 + "-" + number2 + "=");
              int answer = scan.nextInt();
              
              //grade the answer and display the result
              if (number1 - number2 == answer) {
                  System.out.println("You are correct");
                  correctCount++;
              }
              else
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
               
               // Increase the count
               count++;

               output += "\n" + number1 + "-" + number2 + "=" + answer + 
                ((number1 - number2 == answer) ? " correct" : " wrong");
              
                }
                break;
         
         case 3:
            System.out.println("Multiplication Quiz");
           
           
           
           
           
           
            break;
         case 4:
            System.out.println("Division Quiz");
           
           
           
           
           
            break;
         
         case 5:
            System.out.println("Remainder Quiz");
           
           
           
           
           
            break;
     
     
      }
      }
      }
