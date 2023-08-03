/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testcourse;

/**
 *
 * @author tanya
 */
public class TestCourse extends Course {

      public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");
    Course course3 = new Course("Java Programming");
    Course course4 = new Course("Data Structures");
    Course course5 = new Course("Computer Architecture");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    course3.addStudent("Peter Jones");
    course3.addStudent("Brian Smith");
    course3.addStudent("John Berry");
    course3.addStudent("Anne Kennedy");
    
    course3.removeStudent("John Berry");

    course4.addStudent("Alex William");
    course4.addStudent("Brian Smith");
    course4.addStudent("Richard King");
    
    course4.removeStudent("Richard King");

    course5.addStudent("Ashley Downs");
    course5.addStudent("Mark Zoe");

    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
        System.out.println(course1.getCourseName());
    
    System.out.println();
    System.out.println("Number of students in course2: "
      + course1.getNumberOfStudents());
    students = course2.getStudents();
    for (int i = 0; i < course2.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
        System.out.println(course2.getCourseName());

    System.out.println();
    System.out.println("Number of students in course3: "
      + course3.getNumberOfStudents());
    students = course3.getStudents();
    for (int i = 0; i < course3.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
        System.out.println(course3.getCourseName());

    System.out.println();
    System.out.println("Number of students in course4: "
      + course4.getNumberOfStudents());
    students = course4.getStudents();
    for (int i = 0; i < course4.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
        System.out.println(course4.getCourseName());
    
    System.out.println();
    System.out.println("Number of students in course5: "
      + course5.getNumberOfStudents());
    students = course5.getStudents();
    for (int i = 0; i < course5.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");
        System.out.println(course5.getCourseName());      }
}
