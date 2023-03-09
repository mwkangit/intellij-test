package com.edu.day3.pkg2;

public class LMSTest {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 20, "컴퓨터공학");
        Employee e = new Employee("이순신", 47, "입학처");
        Professor p = new Professor("강감찬", 58, "자바");

        s.print();
        e.print();
        p.print();

        final double pi = 3.14;

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person() 생성자 실행!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(name + " : " + age);
    }
}

class Employee extends Person{
    private String dept;

    public Employee(String name, int age, String dept){
        super(name, age);
        this.dept = dept;
        System.out.println("Employee(String, int ,dept) 생성자 실행!");
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public void print() {
        System.out.println(getName() + " : " + getAge() + " : " + dept);
    }
}

class Professor extends Person{
    private String subject;

    public Professor(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
        System.out.println("Professor(String, int ,subject) 생성자 실행!");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void print() {
        System.out.println(getName() + " : " + getAge() + " : " + subject);
    }
}

class Student extends Person{
    private String major;

    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
        System.out.println("Student(String, int ,major) 생성자 실행!");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void print() {
        System.out.println(getName() + " : " + getAge() + " : " + major);
    }
}


