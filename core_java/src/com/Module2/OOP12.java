package com.Module2.copy;

class GradeCalculator {
    void calculateGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: B");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
}

public class OOP12 {
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        int marks = 85;  // You can take user input as well
        gradeCalculator.calculateGrade(marks);
    }
}

