package com.company;

public class UserThread extends Thread {
    private static final int TIMEOUT = 1000;
	private static final int MAX_TURNS = 10;
    private int numberOfTurns = 0;
    public UserThread (String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        Switch aSwitch = Switch.getSwitch();
        while (numberOfTurns < MAX_TURNS) {
            aSwitch.turnSwitch();
            numberOfTurns++;
            try {
                this.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.interrupt();
    }

    @Override
    public boolean isInterrupted() {
        return super.isInterrupted();
    }

}
