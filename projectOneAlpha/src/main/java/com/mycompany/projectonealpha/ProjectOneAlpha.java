/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectonealpha;

import java.util.Scanner;

/**
 *
 * @author Brendan
 */
public class ProjectOneAlpha {

public static void main(String[] args) {
    final int numberOfQuestions = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    
    String output = ""; // output string is initially empty
    Scanner input = new Scanner(System.in);
    int option;
    
        System.out.println("Enter 1 for subtraction");
        System.out.println("Enter 2 for addition");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for remainder");
        System.out.println("Enter 0 to end the program");
        
        
	option = input.nextInt();
	
        if(option==1){
    
        while (count < numberOfQuestions) {
          // 1. Generate two random single-digit integers
          int number1 = (int)(Math.random() * 10);
          int number2 = (int)(Math.random() * 10);
          
          //if number 1 < number 2, swap number1 with number2
              //for subtraction purposes
              if (number1 < number2) {
                  int temp = number1;
                  number1 = number2;
                  number2 = temp;
              }
          // 3. Prompt the student to answer “What is number1 – number2?”
          System.out.print(
            "What is " + number1 + " - " + number2 + "? ");
          int answer = input.nextInt();

          // 4. Grade the answer and display the result
          if (number1 - number2 == answer) {
            System.out.println("You are correct!");
            correctCount++;
          }
          else 
            System.out.println("Your answer is wrong.\n" + number1 
              + " - " + number2 + " should be " + (number1 - number2));

          // Increase the count
          count++;

          output += "\n" + number1 + "-" + number2 + "=" + answer + 
            ((number1 - number2 == answer) ? " correct" : " wrong");
        }
            System.out.println("Your subtraction test grade is " + (int) ((correctCount/(double)count)*100));
            
        }
       
    
if(option==2){
    
        while (count < numberOfQuestions) {
          // 1. Generate two random single-digit integers
          int number1 = (int)(Math.random() * 10);
          int number2 = (int)(Math.random() * 10);
          
          // 3. Prompt the student to answer “What is number1 – number2?”
          System.out.print(
            "What is " + number1 + " + " + number2 + "? ");
          int answer = input.nextInt();

          // 4. Grade the answer and display the result
          if (number1 + number2 == answer) {
            System.out.println("You are correct!");
            correctCount++;
          }
          else
            System.out.println("Your answer is wrong.\n" + number1 
              + " + " + number2 + " should be " + (number1 + number2));

          // Increase the count
          count++;

          output += "\n" + number1 + "+" + number2 + "=" + answer + 
            ((number1 + number2 == answer) ? " correct" : " wrong");
        }
            System.out.println("Your addition test grade is " + (int) ((correctCount/(double)count)*100));
            }

if(option==3){
    
        while (count < numberOfQuestions) {
          // 1. Generate two random single-digit integers
          int number1 = (int)(Math.random() * 10);
          int number2 = (int)(Math.random() * 10);
          
          
          // 3. Prompt the student to answer “What is number1 – number2?”
          System.out.print(
            "What is " + number1 + " * " + number2 + "? ");
          int answer = input.nextInt();

          // 4. Grade the answer and display the result
          if (number1 * number2 == answer) {
            System.out.println("You are correct!");
            correctCount++;
          }
          else
            System.out.println("Your answer is wrong.\n" + number1 
              + " * " + number2 + " should be " + (number1 * number2));

          // Increase the count
          count++;

          output += "\n" + number1 + "*" + number2 + "=" + answer + 
            ((number1 * number2 == answer) ? " correct" : " wrong");
        }
            System.out.println("Your multiplication test grade is " + (int) ((correctCount/(double)count)*100));
            }

if(option==4){
    
        try {
        while (count < numberOfQuestions) {
          // 1. Generate two random single-digit integers
          int number1 = (int)(Math.random() * 10);
          int number2 = (int)(Math.random() * 10);
          
          //if number 1 < number 2, swap number1 with number2
              //for division purposes
              if (number1 < number2) {
                  int temp = number1;
                  number1 = number2;
                  number2 = temp;
              }
          // 3. Prompt the student to answer “What is number1 – number2?”
          System.out.print(
            "What is " + number1 + " / " + number2 + "? ");
          int answer = input.nextInt();

          // 4. Grade the answer and display the result
          if (number1 / number2 == answer) {
            System.out.println("You are correct!");
            correctCount++;
          }
          else
            System.out.println("Your answer is wrong.\n" + number1 
              + " / " + number2 + " should be " + (number1 / number2));

          // Increase the count
          count++;

          output += "\n" + number1 + "/" + number2 + "=" + answer + 
            ((number1 / number2 == answer) ? " correct" : " wrong");
        }
            System.out.println("Your division test grade is " + (int) ((correctCount/(double)count)*100));
            } catch (ArithmeticException e) {
                System.out.println("Cannot Divide by Zero, please try quiz again.");
                }
        } 

if(option==5){
    
        while (count < numberOfQuestions) {
          // 1. Generate two random single-digit integers
          int number1 = (int)(Math.random() * 10);
          int number2 = (int)(Math.random() * 10);
          
          // 3. Prompt the student to answer “What is number1 – number2?”
          System.out.print(
            "What is " + number1 + " % " + number2 + "? ");
          int answer = input.nextInt();

          // 4. Grade the answer and display the result
          if (number1 % number2 == answer) {
            System.out.println("You are correct!");
            correctCount++;
          }
          else
            System.out.println("Your answer is wrong.\n" + number1 
              + " % " + number2 + " should be " + (number1 % number2));

          // Increase the count
          count++;

          output += "\n" + number1 + "%" + number2 + "=" + answer + 
            ((number1 % number2 == answer) ? " correct" : " wrong");
        }
            System.out.println("Your remainder test grade is " + (int) ((correctCount/(double)count)*100));
            }

if(option==0) {
    System.exit(option);
}
    }
    }
    
    
    
    
    
    



