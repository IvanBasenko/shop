package com.rozetka.test14.goods;

import com.rozetka.test14.department.BaseDepartment;
import com.rozetka.test14.interfaces.IElectronicDevice;

public class ElectronicDevice extends BaseGoods  implements IElectronicDevice {
    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

    @Override
    public void on(){

    }
    @Override
    public void off(){

    }

}
