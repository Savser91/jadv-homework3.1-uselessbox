package com.company;

public class Switch {
    private static Switch instance = new Switch();

    private static volatile boolean state = false;
    private Switch(){}
    static Switch getSwitch() {
        return instance;
    }

    synchronized void turnSwitch() {
        if (!state) {
            state = true;
            System.out.println("Тумблер включен");
        } else {
            state = false;
            System.out.println("Тумблер выключен");
        }
    }

    public boolean getState () {
        return state;
    }
}
