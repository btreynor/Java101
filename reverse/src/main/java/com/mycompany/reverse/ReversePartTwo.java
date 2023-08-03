/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reverse;

import java.util.Random;
import java.util.Scanner;



public class ReversePartTwo {

    public static void main(String[] args) {
        
        System.out.println("0 - Exit");
        System.out.println("Press any number 1-9 to continue.");
        
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
                    randomNumberReverse(input);
                    break;
                    case 2:
                    randomNumberReverse(input);
                    break;
                    case 3:
                    randomNumberReverse(input);
                    break;
                    case 4:
                    randomNumberReverse(input);
                    break;
                    case 5:
                    randomNumberReverse(input);
                    break;
                    case 6:
                    randomNumberReverse(input);
                    break;
                    case 7:
                    randomNumberReverse(input);
                    break;
                    case 8:
                    randomNumberReverse(input);
                    break;
                    case 9:
                    randomNumberReverse(input);
                    break;     
            }
        }
        
    public static void randomNumberReverse(Scanner input){
    Random random = new Random();
         
    int num = random.nextInt(999), reversed = 0;
    
    System.out.println("Original Number: " + num);

    // run the while loop
    while(num != 0) {
    
      // get last digit from the random number generated
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }
    System.out.println("Reversed Number: " + reversed);
   }
}


