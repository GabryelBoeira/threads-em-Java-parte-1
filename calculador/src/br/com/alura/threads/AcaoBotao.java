
package br.com.alura.threads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        executandoRunnable();
        executandoThread();
    }

    /**
     * Creates and starts a new thread to execute the TarefaMultiplicacaoThread task.
     */
    private void executandoThread() {

        TarefaMultiplicacaoThread multiplicador = new TarefaMultiplicacaoThread(primeiro, segundo, resultado);
        multiplicador.start();
    }

    /**
     * Creates and starts a new thread to execute the TarefaMultiplicacaoRunnable task.
     */
    private void executandoRunnable() {
        Thread threadCalculo = new Thread(
                new TarefaMultiplicacaoRunnable(primeiro, segundo, resultado), "Thread Multiplicação"
        );

        threadCalculo.start();
    }

}