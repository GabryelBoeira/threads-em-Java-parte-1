package br.com.alura.threads;

import javax.swing.*;
import java.math.BigInteger;

public class TarefaMultiplicacaoRunnable implements Runnable {

    private final JTextField primeiro;
    private final JTextField segundo;
    private JLabel resultado;

    public TarefaMultiplicacaoRunnable(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void run() {
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
