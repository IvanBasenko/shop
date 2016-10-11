package com.rozetka.test14.goods;

import com.rozetka.test14.department.BaseDepartment;

public class PC extends ElectronicDevice{

    public PC(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }

    private int ram;

    public void loadOS(){
        System.out.println("Load MAC OS");
    }


}
