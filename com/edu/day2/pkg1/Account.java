package com.edu.day2.pkg1;

public class Account {

    private static int totalCount; // 총 개설된 계좌 수
    String no; // 계좌번호
    private int balance; // 잔액

    // 기본 생성자
//    public Account() {
//        System.out.println("Account() 호출");
//    }

    public Account(String accNo) {
        this.no = accNo;
        Account.totalCount++;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money){
        balance -= money;
    }

    public void getInfo(){
        System.out.println("계좌번호:" + no);
        System.out.println("잔액:" + balance);
    }

}
