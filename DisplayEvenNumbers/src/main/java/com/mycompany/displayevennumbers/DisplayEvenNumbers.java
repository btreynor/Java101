/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.displayevennumbers;

/**
 *
 * @author tanya
 */
public class DisplayEvenNumbers  
{  
public static void main(String args[]) {
    
int number = 1000;

System.out.print("List of even numbers from 1 to " + number + ": "); 

for (int i = 0; i <= number; i++) {  
    
if (i%2 == 0) {  
System.out.println(i + " ");  
}
}
}
}
