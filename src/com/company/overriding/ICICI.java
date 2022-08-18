package com.company.overriding;

public class ICICI extends ReserveBankOfIndia{

    public float rateofinterest(){
        System.out.println("child class icici bank method");
        return 7.4f ;

    }

    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.rateofinterest();
    }
}
