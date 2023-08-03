/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project3;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class Project3 {

    /** Main method */
  public static void main(String args[]) {
    // Students' answers to the questions
    
    Scanner input = new Scanner(System.in);
        
    int[][] answers = {
      {1, 2, 1, 3, 3, 4, 5, 5, 1, 4},
            {4, 2, 1, 2, 3, 1, 5, 5, 1, 4},
            {4, 2, 4, 3, 3, 4, 1, 5, 1, 4},
            {3, 2, 1, 5, 4, 3, 5, 5, 1, 4},
            {1, 2, 4, 3, 3, 4, 5, 5, 1, 5},
            {2, 2, 5, 3, 3, 4, 5, 5, 1, 4},
            {2, 2, 1, 3, 3, 4, 5, 5, 1, 4},
            {5, 2, 5, 3, 3, 4, 5, 5, 1, 4}};
        
    
    System.out.println("Enter " + answers.length + " rows and " + answers[0].length + " columns: ");
    for (int row = 0; row < answers.length; row++){
        for (int column = 0; column < answers[row].length; column++){
            answers[row][column] = input.nextInt();
        }
    }

    // Key to the questions
    int[] keys = {4, 2, 4, 3, 3, 4, 1, 5, 1, 4};

    // Grade all answers
    for (int i = 0; i < answers.length; i++) {
      // Grade one student
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount++;
      }

      System.out.println("Student " + i + "'s correct count is " +
        correctCount);
    }
  }
  
  public class TestReturnGradeMethod {
  public static void main(String[] args) {
    System.out.print("The grade is " + getGrade(78.5));
    System.out.print("\nThe grade is " + getGrade(59.5));
  }

  public static char getGrade(double score) {
    if (score >= 90.0)
      return 'A';
    else if (score >= 80.0)
      return 'B';
    else if (score >= 70.0)
      return 'C';
    else if (score >= 60.0)
      return 'D';
    else
      return 'F';
  }
}
}

