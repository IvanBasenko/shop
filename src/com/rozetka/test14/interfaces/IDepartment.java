package com.rozetka.test14.interfaces;

import java.util.ArrayList;

/**
 * Created by Basenko on 26.08.2016.
 */
public interface IDepartment {
    String getName();

    ArrayList<IStaff> getEmployeeList();

    ArrayList<IGoods> getGoodsList();
}
