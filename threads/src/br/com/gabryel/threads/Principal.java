package br.com.gabryel.threads;

public class Principal {
    public static void main(String[] args) {

        //Crie um programa com duas threads que imprimem números de 1 até 1000, além da ID da thread

        // Criação da primeira thread
        new Thread(new NumberPrinter(), "Thread-1").start();

        // Criação da segunda thread
        new Thread(new NumberPrinter(), "Thread-2").start();
    }
}