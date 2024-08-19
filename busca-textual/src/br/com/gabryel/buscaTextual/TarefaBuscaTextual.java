package br.com.gabryel.buscaTextual;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

    private String nomeArquivo;
    private String procurarNome;

    public TarefaBuscaTextual(String nomeArquivo, String procurarNome) {
        this.nomeArquivo = nomeArquivo;
        this.procurarNome = procurarNome;
    }

    @Override
    public void run() {
        try {
            Scanner scanner;
            if ( System.getProperties().getProperty("os.name").contains("Windows")) {
                scanner = new Scanner(new File("C:\\Users\\gabry\\Documents\\threads-em-Java-parte-1\\busca-textual\\src\\br\\com\\gabryel\\buscaTextual\\nomes\\" + nomeArquivo));
            } else {
                scanner = new Scanner(nomeArquivo);
            }

            int numeroLinha = 1;

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.matches(procurarNome)) {
                    System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);
                }
                numeroLinha++;
            }
            scanner.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
