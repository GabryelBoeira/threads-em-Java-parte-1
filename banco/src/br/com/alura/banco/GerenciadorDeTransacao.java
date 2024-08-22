package br.com.alura.banco;

public class GerenciadorDeTransacao {

    public void begin() {
        System.out.println("Begin a transação");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void commit() {
        System.out.println("Commit a transação");
    }

    public void rollback() {
        System.out.println("Rollback a transação");
    }

}
