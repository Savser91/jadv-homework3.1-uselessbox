package com.company;

public class Main {

    public static void main(String[] args) {
        UserThread userThread = new UserThread("Пользователь");
        GameThread gameThread = new GameThread("Игрушка");

        userThread.start();
        gameThread.start();
        while (!userThread.isInterrupted()) {

        }

        gameThread.interrupt();

    }
}
