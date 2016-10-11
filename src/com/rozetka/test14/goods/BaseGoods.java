package com.rozetka.test14.goods;



import com.rozetka.test14.interfaces.IDepartment;
import com.rozetka.test14.interfaces.IGoods;


public abstract class BaseGoods implements IGoods {
    public static final int DEAFOULT_GUARANTEE = 2;

    public BaseGoods() {
    }

    public BaseGoods(String name) {
        this.name = name;
    }

    public BaseGoods(double price, boolean hasGuarantee, String name, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.company = company;
    }

    private double price;

    private boolean hasGuarantee;

    private String name;

    private IDepartment department;

    private String company;


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

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
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}








