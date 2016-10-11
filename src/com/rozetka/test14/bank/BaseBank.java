package com.rozetka.test14.bank;

import com.rozetka.test14.interfaces.IBank;

public abstract class BaseBank implements IBank {
    public static int requestCount;
    public BaseBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private String name;
    private String creditDescription;

    @Override
    public void checkInfo(){
        requestCount++;
    }
    @Override
    public void giveCredit(){

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }


}
