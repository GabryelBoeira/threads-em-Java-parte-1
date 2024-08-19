package br.com.gabryel.threads;

public class TarefaLog implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Chama Thread TAREFALOG");
    }

}
