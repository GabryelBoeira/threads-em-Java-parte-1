package br.com.alura.banheiro;

public class TarefaNumero3 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero3(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.limpar();
    }
}
