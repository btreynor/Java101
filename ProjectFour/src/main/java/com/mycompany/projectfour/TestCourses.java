/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.projectfour;

/**
 *
 * @author tanya
 */
public class TestCourses {

    public static void main(String[] args) {

        Courses course1 = new Courses("Data Structures");
        Courses course2 = new Courses("Database Systems");
        Courses course3 = new Courses("Java Programming");
        Courses course4 = new Courses("Data Structures");
        Courses course5 = new Courses("Computer Architecture");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        course3.addStudent("Peter Jones");
        course3.addStudent("John Berry");
        course3.addStudent("Brian Smith");
        course3.addStudent("Anne Kennedy");

        course4.addStudent("Richard King");
        course4.addStudent("Alex Williams");
        course4.addStudent("Brian Smith");

        course5.addStudent("Ashley Down");
        course5.addStudent("Mark Zoe");

        course3.dropStudent("John Berry");
        course4.dropStudent("Richard King");

        System.out.print("Number of students in " + course1.getCourseName()
                + ": " + course1.getNumberOfStudents());

        System.out.println();
        System.out.print("Number of students in " + course2.getCourseName()
                + ": " + course2.getNumberOfStudents());

        System.out.println();
        System.out.print("Number of students in " + course3.getCourseName()
                + ": " + course3.getNumberOfStudents());

        System.out.println();
        System.out.print("Number of students in " + course4.getCourseName()
                + ": " + course4.getNumberOfStudents());

        System.out.println();
        System.out.print("Number of students in " + course5.getCourseName()
                + ": " + course5.getNumberOfStudents());
    }
}
