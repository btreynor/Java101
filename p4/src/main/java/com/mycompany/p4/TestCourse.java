/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p4;

/**
 *
 * @author tanya
 */
public class TestCourse {
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
