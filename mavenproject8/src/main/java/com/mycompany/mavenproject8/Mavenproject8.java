/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject8;

/**
 *
 * @author tanya
 */


public class Mavenproject8 {
    public static void main (String[] args) {
        int[] list1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
        
        for(int i = 0; i<list2.length; i++)
            System.out.println(list2[i]);
    }
    
public static int[] reverse(int[] list) {
    int[] result = new int[list.length];
    for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
        result[j] = list[i];
        }
            return result;
    }
}

