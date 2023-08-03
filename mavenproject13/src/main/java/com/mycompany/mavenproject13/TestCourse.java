/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;

/**
 *
 * @author tanya
 */
public class TestCourse {
    public static void main(String[] args) {
    Mavenproject13 course1 = new Mavenproject13("Data Structures");
    Mavenproject13 course2 = new Mavenproject13("Database Systems");
    Mavenproject13 course3 = new Mavenproject13("Java Programming");
    Mavenproject13 course4 = new Mavenproject13("Data Structures");
    Mavenproject13 course5 = new Mavenproject13("Computer Architecture");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    course3.addStudent("Peter Jones");
    course3.addStudent("Brian Smith");
    course3.addStudent("John Berry");
    course3.addStudent("Anne Kennedy");

    course4.addStudent("Alex William");
    course4.addStudent("Brian Smith");
    course4.addStudent("Richard King");

    course5.addStudent("Ashley Downs");
    course5.addStudent("Mark Zoe");

    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
    
    System.out.println();
    System.out.print("Number of students in course2: "
      + course2.getNumberOfStudents());

    System.out.println();
    System.out.print("Number of students in course2: "
      + course3.getNumberOfStudents());

    System.out.println();
    System.out.print("Number of students in course2: "
      + course4.getNumberOfStudents());
    
    System.out.println();
    System.out.print("Number of students in course2: "
      + course5.getNumberOfStudents());
  }
}
    

