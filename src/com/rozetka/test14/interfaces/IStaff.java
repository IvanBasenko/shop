package com.rozetka.test14.interfaces;


import com.rozetka.test14.department.BaseDepartment;
import com.rozetka.test14.service.BaseStaff;

/**
 * Created by Basenko on 26.08.2016.
 */
public interface IStaff {
    String getName();

    IDepartment getDepartment();

    boolean isFree();

    void setDepartment (IDepartment department);
}
