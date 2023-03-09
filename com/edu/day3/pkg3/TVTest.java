package com.edu.day3.pkg3;

public class TVTest {
    public static void main(String[] args) {
//        SamsungTV tv = new SamsungTV();
//        tv.turnOn();
//        tv.turnOff();
//        tv.volumeDown();
//        tv.volumeUp();


//        SamsungTV tv = new SamsungTV();
//        LgTV tv = new LgTV();
//        tv.turnOn();
//        tv.soundUp();
//        tv.soundDown();
//        tv.turnOff();

        // 다형성
//        TV tv = new LgTV();
//        tv.turnOn();
//        tv.soundUp();
//        tv.soundDown();
//        tv.turnOff();

        // 팩토리 디자인 패턴
        TV tv = BeanFactory.getBean("samsung");
        tv.turnOn();
        tv.soundUp();
        tv.soundDown();
        tv.turnOff();

    }
}

class BeanFactory{
    public static TV getBean(String name){
        TV tv = null;
        if(name.equals("samsung")){
            tv = new SamsungTV();
        }else if(name.equals("lg")){
            tv = new SamsungTV();
        }

        return tv;
    }
}