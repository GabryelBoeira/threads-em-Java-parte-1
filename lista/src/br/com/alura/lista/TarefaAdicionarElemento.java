package br.com.alura.lista;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private Lista lista;
    private int numeroThread;

    public TarefaAdicionarElemento(Lista lista, int numeroThread) {
        this.numeroThread = numeroThread;
        this.lista = lista;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.lista.adicionarElementos("Thread: " + this.numeroThread + " - elemento " + i);
        }
    }
}
