package br.com.alura.lista;

import java.util.List;

public class TarefaAdicionarElementoArrayList implements Runnable {

    private List<String> lista;
    private int numeroThread;

    public TarefaAdicionarElementoArrayList(List<String> lista, int numeroThread) {
        this.numeroThread = numeroThread;
        this.lista = lista;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.lista.add("Thread: " + this.numeroThread + " - elemento " + i);
        }
    }
}
