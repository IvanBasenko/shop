package com.rozetka.test14.service;

import com.rozetka.test14.department.BaseDepartment;
import com.rozetka.test14.interfaces.IDepartment;
import com.rozetka.test14.interfaces.IStaff;

public abstract class BaseStaff implements IStaff {
    public BaseStaff() {
    }

    public BaseStaff(String name) {
        this.name = name;

    }

    private String name;
    private IDepartment department;
    private boolean free;


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public IDepartment getDepartment() {
        return department;
    }

    public void setDepartment(IDepartment department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
