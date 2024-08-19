package br.com.alura.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

    private Lock lock = new ReentrantLock();

    public void fazerNumero1() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + ": batendo na porta");

        lock.lock();

        System.out.println(nome + ": Entrando no banheiro");
        System.out.println(nome + ": Fazendo coisa rapida");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + ": dando descarga");
        System.out.println(nome + ": lavando a mão");
        System.out.println(nome + ": Saindo do banheiro");

        lock.unlock();
    }

    public void fazerNumero2() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + ": batendo na porta");

        lock.lock();

        System.out.println(nome + ": Entrando no banheiro");
        System.out.println(nome + ": Fazendo coisa demorada");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nome + ": dando descarga");
        System.out.println(nome + ": lavando a mão");
        System.out.println(nome + ": Saindo do banheiro");

        lock.unlock();

    }

}
