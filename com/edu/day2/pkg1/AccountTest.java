package com.edu.day2.pkg1;

public class AccountTest {

    public static void main(String[] args) {
        // 계좌 개설
        Account acc1 = new Account("acc02");
        acc1.deposit(50000);
        acc1.withdraw(20000);
        System.out.println();

        Account acc2 = new Account("a001");
        acc1.getInfo();
        acc2.getInfo();
    }
}