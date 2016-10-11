package com.rozetka.test14.goods;

public class TV extends ElectronicDevice {

    public TV(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

    public void selectChannel(){
        System.out.println("ds");

    }

    public void selectChannel(boolean channel){
        System.out.println("Channel = " + 2 + " Mega");
    }
}
