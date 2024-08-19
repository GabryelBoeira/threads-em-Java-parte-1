package br.com.alura.lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<String> elementos = new ArrayList<>();
    private int posicao = 0;

    public synchronized void adicionarElementos(String elemento) {
        this.elementos.add(posicao, elemento);
        this.posicao++;
    }

    public int tamanho() {
        return this.elementos.size();
    }

    public String pegaElemento(int posicao) {
        return this.elementos.get(posicao);
    }

}
