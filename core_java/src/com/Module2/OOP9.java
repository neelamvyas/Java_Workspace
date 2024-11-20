package com.Module2.copy;

abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks {
    int subject1, subject2, subject3;

    StudentA(int s1, int s2, int s3) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class StudentB extends Marks {
    int subject1, subject2, subject3, subject4;

    StudentB(int s1, int s2, int s3, int s4) {
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
        this.subject4 = s4;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class OOP9 {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(85, 90, 95);
        StudentB studentB = new StudentB(80, 85, 90, 95);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}

