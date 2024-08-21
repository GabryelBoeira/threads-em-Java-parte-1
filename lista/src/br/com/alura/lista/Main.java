package br.com.alura.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Formas de trabalhar com lista sincronas
        List<String> lista = Collections.synchronizedList(new ArrayList<>());
        List<String> listaVector = new Vector<>();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElementoArrayList(lista, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < lista.size(); i++) {
           System.out.println(i + " - " + lista.get(i));
        }
    }
}