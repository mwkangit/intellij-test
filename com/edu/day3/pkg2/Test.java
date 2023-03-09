package com.edu.day3.pkg2;

public class Test {

    public static void main(String[] args) {
        Myclass a = new Myclass("kaka");
        Myclass b = new Myclass("kiki");

        System.out.println(a.equals(b));
    }
}

class Myclass extends Object{
    String name;
    Myclass(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Myclass){
            Myclass m = (Myclass) obj;
            if(this.name.equals(m.name)){
                return true;
            }
        }
        return false;
    }
}