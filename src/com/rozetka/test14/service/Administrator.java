package com.rozetka.test14.service;

import com.rozetka.test14.SalesRoom;
import com.rozetka.test14.interfaces.IDepartment;
import com.rozetka.test14.interfaces.IStaff;

public class Administrator {
    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant (IDepartment iDepartment){
        for (IStaff staff : iDepartment.getEmployeeList()){
            if (staff instanceof Consultant){
                if (staff.isFree()){
                    return (Consultant) staff;
                }
            }
        }
        return null;
    }
}
