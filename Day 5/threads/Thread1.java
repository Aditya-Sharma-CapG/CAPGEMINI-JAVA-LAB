package com.threads;

public class Thread1 implements Runnable{

    public static void main(String[] args) {

        Thread thread1 = new Thread("Guru1");
        Thread thread2 = new Thread("Guru2");

        thread1.start();
        thread2.start();

        System.out.println("Thread names are following:");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
    }
    @Override
    public void run() {
    }
}
