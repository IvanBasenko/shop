package com.rozetka.test14.bank;

public class PrivatBank extends BaseBank {

    public PrivatBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {

    }
    public void checkInfo (boolean critical){
        System.out.println("private");
    }

}

