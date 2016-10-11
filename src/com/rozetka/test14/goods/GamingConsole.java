package com.rozetka.test14.goods;

public class GamingConsole extends ElectronicDevice{
    public GamingConsole(String name, int ram) {
        super(name);
        this.ram = ram;
    }

    private int ram;

    public void loadGame(){
        System.out.println("Game FIFA 17");
    }

}

