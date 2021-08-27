package org.jz.c23;

public class C23Exercise1 implements Runnable {
    public C23Exercise1() {
        System.out.println("Into constructor...");
    }
    @Override
    public void run() {
        System.out.println("msg...");
        Thread.yield();
        System.out.println("msg...");
        Thread.yield();
        System.out.println("msg...");
        Thread.yield();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new C23Exercise1()).start();
        }
        System.out.println("end main...");
    }
}
