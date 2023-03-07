package com.edu.day2.pkg1;

import com.edu.day2.pkg2.Speaker;

public class Car {
    String 모델명;
    int 배기량;
    String 색상;
    int speed;
    Speaker speaker;

    public void speedUp(){
        System.out.println("속도를 올린다.");
    }
    public void speedDown(){
        System.out.println("속도를 내린다.");
    }

}
