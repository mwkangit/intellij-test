package com.edu.day3.pkg1;

public class LMSTest {
    public static void main(String[] args) {
        Student s = new Student();
//        com.edu.day3.pkg3.Employee e = new com.edu.day3.pkg3.Employee();
        Professor p = new Professor();

        s.setName("홍길동");
        s.setAge(20);
        s.setMajor("컴퓨터공학");

//        e.setName("이순신");
//        e.setAge(47);
//        e.setDept("입합처");

        p.setName("강감찬");
        p.setAge(58);
        p.setSubject("자바");

        s.print();
//        e.print();
        p.print();
    }
}

class Person{
    private String name;
    private int age;

    public Person(){
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

    public Employee(){

        System.out.println("Employee() 생성자 실행!");
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

    public Professor(){
        System.out.println("Professor() 생성자 실행!");
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

    public Student(){
        System.out.println("Student() 생성자 실행!");
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


