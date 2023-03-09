package com.edu.day2.pkg2;

public class PersonTest {

    public static void main(String[] args) {
        Student s = new Student();
        Employee e = new Employee();
        Professor p = new Professor();
        s.age = 20;
        s.name = "Amy";
        s.major = "IT";

        e.age = 47;
        e.name = "Josh";
        e.dept = "입학처";

        p.age = 53;
        p.name = "John";
        p.subject = "Java";
    }

}
class Person{
    String name;
    int age;
}

class Employee extends Person{
    String dept;
}

class Professor extends Person{
    String subject;
}

class Student extends Person{
    String major;
}
