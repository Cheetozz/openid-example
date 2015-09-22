package ru.sa2.system;

/**
 * Created by Admin on 27.04.2015.
 */
public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new WebThread());
        thread.start();
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
