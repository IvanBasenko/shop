package com.rozetka.test14.srart;


import com.rozetka.test14.SalesRoom;
import com.rozetka.test14.client.Vip;
import com.rozetka.test14.client.Visitor;
import com.rozetka.test14.department.ElectronicDep;
import com.rozetka.test14.department.GameDep;
import com.rozetka.test14.enums.ConsultResult;
import com.rozetka.test14.goods.GamingConsole;
import com.rozetka.test14.goods.PC;
import com.rozetka.test14.goods.TV;
import com.rozetka.test14.service.Administrator;
import com.rozetka.test14.service.Consultant;
public class Main  {
    public static void main(String[] args) {

    imitateShopWorking();
    }
    private static void imitateShopWorking(){
        SalesRoom salesRoom = new SalesRoom(); // создаем торговый зал

        //создаем администратора торгового зала
        Administrator administrator = new Administrator(salesRoom);

        //создаем два отдела
        ElectronicDep electronicDep = new ElectronicDep("ElDom");
        GameDep gameDep = new GameDep("SDS");

        // добавляем отделы в торговый зал
        salesRoom.addDepartment(electronicDep);
        salesRoom.addDepartment(gameDep);

        // добавляем сотрудников в каждый отдел
        Consultant consultant1 = new Consultant("Джон");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Anna");

        electronicDep.addStaff(consultant1);
        electronicDep.addStaff(consultant2);

        // создаем товары для отделов
        PC pc = new PC(200, true, "MacBook", "Apple", 2048);
        TV tv = new TV(1000, false, "SmartTv", "Samsung");
        GamingConsole ps4 = new GamingConsole("PS4", 2048);


        //добавляем товарі в отделы
        electronicDep.addGoods(tv);
        electronicDep.addGoods(pc);
        gameDep.addGoods(ps4);

        //создаем покупателей

        Visitor visitor1 = new Visitor("Cavin");
        Vip vip1 = new Vip("John",50);

        //ищем свободного консультанта из нужного отдела
        ConsultResult consultResult = administrator.getFreeConsultant (electronicDep).consult(visitor1);

        switch (consultResult){
            case BUY:
                visitor1.buy(ps4);
                visitor1.buy(tv);
                visitor1.buy(pc);
                break;
            case EXIT:
                break;
        }
    }
}
