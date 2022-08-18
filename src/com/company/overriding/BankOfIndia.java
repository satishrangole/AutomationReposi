package com.company.overriding;

public class BankOfIndia extends ReserveBankOfIndia {

    public float rateofinterest(){
        System.out.println("child class bank of india");
        return 6.7f ;

    }

    public static void main(String[] args) {
        BankOfIndia bankOfIndia = new BankOfIndia();
        bankOfIndia.rateofinterest();
    }
}
