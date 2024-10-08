package br.com.alura.threads;

import javax.swing.*;
import java.math.BigInteger;

public class TarefaMultiplicacaoThread extends Thread {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public TarefaMultiplicacaoThread(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    public void run () {

        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());

        BigInteger calculo = new BigInteger("0");

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                calculo = calculo.add(new BigInteger("1"));
            }
        }

        resultado.setText(calculo.toString());
    }
}
