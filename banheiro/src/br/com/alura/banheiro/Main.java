package br.com.alura.banheiro;

public class Main {

    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Convidado 1");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Convidado 2");
//        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Convidado 3");
//        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Convidado 4");

        Thread limpeza1 = new Thread(new TarefaNumero3(banheiro), "Limpeza 1");

        convidado1.start();
        convidado2.start();
        limpeza1.start();
//        convidado3.start();
//        convidado4.start();
    }

}