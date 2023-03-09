package com.edu.day3.pkg3;

public class SamsungTV implements TV{
    public void turnOn(){
        System.out.println("SamsungTV 전원을 켠다.");
    }

    public void turnOff(){
        System.out.println("SamsungTV 전원을 끈다.");
    }

    @Override
    public void soundUp() {
        System.out.println("SamsungTV 소리를 올린다.");
    }

    @Override
    public void soundDown() {
        System.out.println("SamsungTV 소리를 내린다.");
    }

    public void volumeUp(){
        System.out.println("SamsungTV 소리를 올린다.");
    }

    public void volumeDown(){
        System.out.println("SamsungTV 소리를 내린다.");
    }
}
