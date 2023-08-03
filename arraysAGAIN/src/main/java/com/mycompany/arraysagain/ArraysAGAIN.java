/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraysagain;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ArraysAGAIN {



/**

@param args the command line arguments */ 
    
public static void main(String[] args) { 


Scanner scan = new Scanner (System.in);

System.out.print("How many questions are in the quiz? "); 
int a = scan.nextInt(); 
System.out.println("");

String user = "y";

int[] quizKey = new int[a];

for (int i = 0; i < a; i++) { 
    System.out.print("Enter the answer for Solution " + (i+1) + ": "); 
    int k = scan.nextInt(); 
    quizKey[i] = k; 
    
    System.out.println(""); }

while(user.equalsIgnoreCase("y")) { 
    double total = 0.0; 
    System.out.println("Begin entering the answers to be graded: ");

for (int p = 1; p <= a; p++) { 
    int n = (p-1); System.out.print("Question " + p +") "); 
    int s = scan.nextInt();

      System.out.println("");

      if (quizKey[n] == s)
        	{
          total++;
            }
}

double r= total/a; 
String percent = (r*100 + "%"); 
System.out.println("The student got " + total + " correct, for a percent of: " + percent);

    String numb = scan.nextLine();

    user = "q";

    if (user.equalsIgnoreCase("q"))
     {
         System.out.println("Grade for another quiz? <y/n> ");
          user = scan.nextLine();

           r= 0.0;
       }

     while(user.equalsIgnoreCase("n"))
     {
         System.exit(0);
     }
 }
} }


