package com.kyotoyx.tank;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tk = new TankFrame();

        while (true) {
            Thread.sleep(10);
            tk.repaint();
        }
    }
}
