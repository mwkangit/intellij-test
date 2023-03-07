package com.edu.day2.pkg1;

public class MyDateTest {
    static {
        System.out.println("hello~~");
    }

    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setDay(45);
        System.out.println(date.getDay());
        MyDate.print1();
    }
}

class MyDate{
    int year;
    int month;
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(this.day>31){
            System.out.println("질멋된 값입니다!");
        }else{
            day = this.day;
        }
    }

    static public void print1(){
        System.out.println("print1");
    }


}