package com.edu.day3.pkg3;

public class HRTest {
    public static void calcTax(Employee e){
        if(e instanceof Salesman){
            System.out.println("Salesman");
            Salesman s = (Salesman)e;
            System.out.println(s.annual_sales);
        }else if(e instanceof Consultant){
            System.out.println("Consultant");
            Consultant c = (Consultant) e;
            System.out.println(c.name);
        }else if(e instanceof Director){
            System.out.println("Director");
            Director d = (Director) e;
            System.out.println(d.name);
        }
    }

    public static void main(String[] args) {
        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Director d = new Director();

        calcTax(s);
        calcTax(c);
        calcTax(d);

    }
}

abstract class Employee{
    String name;
    int salary;

    public abstract void calcSalary();
}

class Salesman extends Employee{
    int annual_sales;
    @Override
    public void calcSalary() {

    }
}

class Consultant extends Employee{

    int num_project; // 컨설팅 참여 수
    @Override
    public void calcSalary() {

    }
}

class Director extends Employee{

    @Override
    public void calcSalary() {

    }
}