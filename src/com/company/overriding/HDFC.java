package com.company.overriding;

public class HDFC extends ReserveBankOfIndia{

   public float rateofinterest(){
        System.out.println("child class hdfc bank method");
        return 7.4f ;

    }

    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.rateofinterest();
    }
}
