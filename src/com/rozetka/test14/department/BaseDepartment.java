package com.rozetka.test14.department;

import com.rozetka.test14.interfaces.IDepartment;
import com.rozetka.test14.interfaces.IGoods;
import com.rozetka.test14.interfaces.IStaff;

import java.util.ArrayList;

public abstract class BaseDepartment implements IDepartment{
    public BaseDepartment() {
    }

    public BaseDepartment(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<IStaff>employeeList = new ArrayList<IStaff>();
    private ArrayList<IGoods>goodsList = new ArrayList<IGoods>();

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public ArrayList<IStaff> getEmployeeList() {
        return employeeList;
    }
    public void setEmployeeList(ArrayList<IStaff> employeeList) {
        this.employeeList = employeeList;
    }
    @Override
    public ArrayList<IGoods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<IGoods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addStaff (IStaff staff){
        staff.setDepartment(this);
        employeeList.add(staff);
    }

    public void addGoods (IGoods goods){
        goods.setDepartment(this);
        goodsList.add(goods);
    }



    
}
