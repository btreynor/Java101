/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author tanya
 */
public class Mavenproject7 {

public static void main(String[] args) {
int height, length, area;

Scanner in = new Scanner(System.in);
System.out.println("Enter the length of the triangle");
length = in.nextInt();

System.out.println("Enter the width of the triangle");
height = in.nextInt();

area = ((height * length)/2);
System.out.println("Area of Triangle = " + area);
    }
}


