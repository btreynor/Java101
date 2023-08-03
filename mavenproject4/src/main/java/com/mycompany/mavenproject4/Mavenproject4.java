/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class Mavenproject4 {

	private static Scanner sc;
	public static void main(String[] args) 
	{
		int min, max, evenSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Minimum value : ");
		min = sc.nextInt();	
		
		System.out.print(" Please Enter the Maximum value : ");
		max = sc.nextInt();	
		
		evenSum = sumOfEven(min, max);	
		System.out.println("\n The Sum of Even Numbers from " + min + " to " + max + "  =  " + evenSum);
	}
	
	public static int sumOfEven(int min, int max){
		int i, sum = 0;
		if(min % 2 != 0){
			min++;
		}
		for(i = min; i <= max; i++){
			if(i % 2 == 0){
                            sum = sum + i;  
			}
		}
		return sum;
	}
}
