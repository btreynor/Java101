/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.final1;

/**
 *
 * @author tanya
 */
public class Final1 {
public static void main(String[] args) {
    int x = 0;
    int[] y = {1, 2, 3, 4, 5};
    m(x, y);
    System.out.println("x is " + x);
    System.out.println("y[3] is " + y[3]);
}

public static void m (int number, int[] numbers) {
    number = 1;
    numbers[3] = 6;
    
}
}