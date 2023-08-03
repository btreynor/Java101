/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projecttwoalpha;

import java.util.Scanner;

/**
 *
 * @author brendan
 */
public class ProjectTwoAlpha {

public static void main(String[] args) {   
        
        //first show the user their choices
        System.out.println("Press 0 to exit the Quiz");
        System.out.println("Press 1 for Subtraction.");
	System.out.println("Press 2 for Addition.");
	System.out.println("Press 3 for Multiplication.");
	System.out.println("Press 4 for Division.");
	System.out.println("Press 5 for Remainder.");
        
        
        //ask them what they would like to do
    while (true) {
        System.out.println("What would you like to do?: ");
            
        Scanner input = new Scanner(System.in);
            
        int choice = Integer.parseInt(input.nextLine());
            
            if (choice == 0) {
                break;
            }
            
            chooser(choice, input);
        }
    }
    
    public static void chooser(int choice, Scanner input) {
            
        switch (choice) {
            
                case 0:
                    System.exit(0);
                case 1:
                    subtraction(input);
                    break;
                case 2:
                    addition(input);
                    break;
                case 3:
                    multiplication(input);
                    break;
                case 4:
                    division(input);
                    break;
                case 5:
                    remainder(input);
                    break;
            }
        }
        
public static void subtraction(Scanner input){
    
    final int numberOfQuestions = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    
    String output = ""; // output string is initially empty
        
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

public static void addition(Scanner input){
    
    final int numberOfQuestions = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    
    String output = ""; // output string is initially empty
        
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

public static void multiplication(Scanner input){
    
    final int numberOfQuestions = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    
    String output = ""; // output string is initially empty
                  
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

public static void division(Scanner input){
    
        final int numberOfQuestions = 5; // Number of questions
	int correctCount = 0; // Count the number of correct answers
	int count = 0; // Count the number of questions
    
	String output = ""; // output string is initially empty
        
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

public static void remainder(Scanner input){
    
    final int numberOfQuestions = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    
    String output = ""; // output string is initially empty
    
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
}
