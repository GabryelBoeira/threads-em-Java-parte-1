package br.com.gabryel.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Antes Thread MAIN");

        Thread.sleep(50000);

        System.out.println("Depois Thread MAIN");
    }

}