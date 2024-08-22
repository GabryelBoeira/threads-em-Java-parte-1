package br.com.alura.banco;

public class GerenciadorDeTransacao {

    public void begin() {
        System.out.println("begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void commit() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Commit");
    }

    public void rollback() {
        System.out.println("Rollback");
    }

}
