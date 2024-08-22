package br.com.alura.banco;

public class PoolDeConexao {

    public String getConnection() {
        System.out.println("Get a connection");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Connection";
    }
}
