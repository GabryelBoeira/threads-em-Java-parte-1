package br.com.gabryel.threads;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " - Número: " + i);
        }
    }
}
