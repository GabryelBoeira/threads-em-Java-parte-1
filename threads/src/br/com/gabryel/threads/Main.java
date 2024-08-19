package br.com.gabryel.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Antes Thread MAIN");

        Thread.sleep(5000);

        Thread t = new Thread(new TarefaLog());
        t.start();

        //Trabalhar com Threads anônimas, codigo explicito por questoes de legibilidade
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Depois Thread MAIN");
            }
        }).start();

    }

}