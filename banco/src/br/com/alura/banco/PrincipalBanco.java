package br.com.alura.banco;

public class PrincipalBanco {
    public static void main(String[] args) {
        GerenciadorDeTransacao transacao = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();

        new Thread(new TarefaAcessoBanco(transacao, pool)).start();
        new Thread(new TarefaAcessoBancoProcedimento(transacao, pool)).start();

    }
}