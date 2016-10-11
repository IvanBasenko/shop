package com.rozetka.test14.service;

import com.rozetka.test14.department.BaseDepartment;
import com.rozetka.test14.enums.ConsultResult;
import com.rozetka.test14.interfaces.IDepartment;
import com.rozetka.test14.interfaces.IVisitor;

public class Consultant extends BaseStaff {
    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(IVisitor visitor){
        super.setFree(false);

        return ConsultResult.BUY;
    }

    public void send(){

    }

    public void setDepartment (IDepartment department){
        super.setDepartment(department);
    }

}
