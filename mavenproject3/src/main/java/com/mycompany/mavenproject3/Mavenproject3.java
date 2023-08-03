/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {
	private static Scanner sc;
	public static void main(String[] args) {
		int number, i, evenSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 2; i <= number; i = i + 2)
		{
			evenSum = evenSum + i; 
		}
		System.out.println("\n The Sum of Even Numbers up to " + number + "  =  " + evenSum);
	}
}