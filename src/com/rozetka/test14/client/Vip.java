package com.rozetka.test14.client;

import com.rozetka.test14.interfaces.IGoods;

public class Vip extends BaseVisitor {

    public Vip(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    private float discount;


    @Override
    public void buy(IGoods goods) {
        if (!checkDiscount()) {
        } else {

        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }

}