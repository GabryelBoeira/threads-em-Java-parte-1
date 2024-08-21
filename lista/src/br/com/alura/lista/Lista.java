package br.com.alura.lista;

public class Lista {

    private final String[] elementos = new String[1000];
    private int posicao = 0;

    public synchronized void adicionarElementos(String elemento) {
        this.elementos[posicao] = elemento;
        this.posicao++;

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (this.posicao == 1000) {
            System.out.println("A lista esta cheia");
            this.notify();
        }
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

    public boolean estaCheia() {
        return this.posicao == this.tamanho();
    }

}
