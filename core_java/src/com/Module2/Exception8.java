package com.Module2.copy;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15-21)");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains invalid characters");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}

public class Exception8 {
    public static void main(String[] args) {
        try {
            Student student = new Student(1, "John123", 18, "Computer Science");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

