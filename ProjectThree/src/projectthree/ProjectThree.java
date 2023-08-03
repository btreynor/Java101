/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectthree;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class ProjectThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Key to the questions
        int[] keys = {4, 2, 4, 3, 3, 4, 1, 5, 1, 4};
        
        System.out.println("Fill in the eight student's answers to 10 questions");
        
        int[][] list = new int[8][10];
        int[][] sort = new int[8][1];
        
        // Students' answers to the questions
        for (int i =0;i<list.length;i++)
            {
        int count =0;
        for (int j =0;j<list[i].length;j++)
            {
        list[i][j] = input.nextInt();
        if(list[i][j]==(keys[j]))
            {  count++;
          sort[i][0] = count;
        }        

        String letterGrade = "letter";
        // Grade all answers
        for (i = 0; i < list.length; i++) {
          // Grade one student
          int correctCount = 0;
          for (j = 0; j < list[i].length; j++) {
            if (list[i][j] == keys[j])
              correctCount++;
          
          }
         if(correctCount >= 9){
             letterGrade = "A";
             }
         if(correctCount == 8){
             letterGrade = "B";
             }
         if(correctCount == 7){
             letterGrade = "C";
             }
         if(correctCount == 6){
              letterGrade = "D";
             }
          if(correctCount < 4){
             letterGrade = "F";
          
                System.out.println("Student " + i + "'s correct percentage is " + correctCount * 10 + "%" + " - " + letterGrade);
          }}}}}}
      
        
            
            
    
    
            
        
    