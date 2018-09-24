package com.slayway.game;

public class MainThread extends Thread{
    //флаг, указывающий на то, что игра запущена.

    private boolean running;
    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        while (running) {
            // обновить состояние игровых объектов
            // вывести графику на экран
        }
    }
}

