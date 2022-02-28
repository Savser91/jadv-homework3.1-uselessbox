package com.company;

public class GameThread extends Thread {

    public GameThread (String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        Switch aSwitch = Switch.getSwitch();
            if (aSwitch.getState()) {
                aSwitch.turnSwitch();
            }

    }
}
