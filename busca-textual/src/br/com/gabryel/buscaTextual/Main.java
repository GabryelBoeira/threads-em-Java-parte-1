package br.com.gabryel.buscaTextual;

public class Main {
    public static void main(String[] args) {
        String procurarNome = "da";

        Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", procurarNome));

        Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", procurarNome));

        Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", procurarNome));

        threadAssinaturas1.start();
        threadAssinaturas2.start();
        threadAutores.start();

    }
}