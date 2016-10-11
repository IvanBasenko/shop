package com.rozetka.test14.interfaces;

import com.rozetka.test14.department.BaseDepartment;

/**
 * Created by Basenko on 26.08.2016.
 */
public interface IGoods {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    IDepartment getDepartment();

    String getCompany();

    void setDepartment(IDepartment department);
}
