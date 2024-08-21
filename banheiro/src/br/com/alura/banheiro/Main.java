package br.com.alura.banheiro;

public class Main {

    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Convidado 1");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Convidado 2");

        Thread limpeza = new Thread(new TarefaNumero3(banheiro), "Limpeza 1");
        limpeza.setDaemon(true);
        limpeza.setPriority(Thread.MAX_PRIORITY);


        limpeza.start();
        convidado1.start();
        convidado2.start();
    }

}