/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.displaycertainnumbers;

/**
 *
 * @author tanya
 */
public class DisplayCertainNumbers {
    	public static void main(String args[]) {
		System.out.println("\nDivided by 3: ");		
		for (int i=1; i<1000; i++) {
			if (i%3==0) 
			System.out.print(i +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		for (int i=1; i<1000; i++) {
			if (i%5==0) System.out.print(i +", ");			
		}				
  }
}