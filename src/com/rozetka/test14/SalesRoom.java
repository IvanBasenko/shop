package com.rozetka.test14;


import com.rozetka.test14.interfaces.IDepartment;
import com.rozetka.test14.interfaces.IVisitor;

import java.util.ArrayList;


public class SalesRoom {

    public static final String SHOP_NAME = "ROZETKA";
    private ArrayList<IDepartment> departmentList = new ArrayList<IDepartment>();

    private ArrayList<IVisitor> visitorList = new ArrayList<IVisitor>();

    public ArrayList<IDepartment> getDepartmentList(){
        return departmentList;
    }
    public void addDepartment(IDepartment department){
        departmentList.add(department);
    }
    public void addVisitor (IVisitor visitor){
        visitorList.add(visitor);
    }


}
