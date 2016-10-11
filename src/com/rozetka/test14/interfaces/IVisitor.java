package com.rozetka.test14.interfaces;

/**
 * Created by Basenko on 26.08.2016.
 */
public interface IVisitor {

    void buy(IGoods goods);

    void returnGoods(IGoods goods);

    String getName();
}
