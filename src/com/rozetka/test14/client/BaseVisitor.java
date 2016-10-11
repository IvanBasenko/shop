package com.rozetka.test14.client;

import com.rozetka.test14.goods.GamingConsole;
import com.rozetka.test14.goods.PC;
import com.rozetka.test14.goods.TV;
import com.rozetka.test14.interfaces.IGoods;
import com.rozetka.test14.interfaces.IVisitor;

public abstract class BaseVisitor implements IVisitor{
    public BaseVisitor(String name) {
        this.name = name;
        System.out.println("Пришел покупатель "+ getName());
    }

    private String name;
    @Override
    public void buy(IGoods goods){
        System.out.println(goods.getName());
        if ( goods instanceof TV){
            ((TV)goods).selectChannel(true);

        }
        if ( goods instanceof PC){
            ((PC)goods).loadOS();


        }
        if ( goods instanceof GamingConsole){
            ((GamingConsole)goods).loadGame();
        }
    }
    @Override
    public void returnGoods(IGoods goods){

    }

    @Override
    public String getName() {
        return name;
    }


}

