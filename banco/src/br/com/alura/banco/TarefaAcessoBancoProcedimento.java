package br.com.alura.banco;

public record TarefaAcessoBancoProcedimento(GerenciadorDeTransacao transacao, PoolDeConexao pool) implements Runnable {

    @Override
    public void run() {
        synchronized (transacao) {
            System.out.println("transacao: Tarefa Acesso Banco Procedimento");
            transacao.begin();
            synchronized (pool) {
                System.out.println("conexao: Tarefa Acesso Banco Procedimento");
                pool.getConnection();
            }
        }
    }
}
