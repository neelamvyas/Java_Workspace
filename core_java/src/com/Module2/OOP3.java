package com.Module2.copy;
//Member class with salary printing....
class Member
{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() 
    {
        System.out.println("Salary: " + salary);
    }
}

public class OOP3 {
    public static void main(String[] args)
    {
        Member member = new Member();
        member.name = "John Doe";
        member.age = 30;
        member.phoneNumber = "1234567890";
        member.address = "123 Main St";
        member.salary = 50000;
        
        member.printSalary();
    }
}
