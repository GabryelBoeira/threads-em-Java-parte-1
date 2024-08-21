package br.com.alura.lista;

public class Lista {

    private String[] elementos = new String[100];
    private int posicao = 0;

    public synchronized void adicionarElementos(String elemento) {
        this.elementos[posicao] = elemento;
        this.posicao++;
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

}
