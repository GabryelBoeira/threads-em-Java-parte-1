package br.com.alura.banco;

public record TarefaAcessoBanco(GerenciadorDeTransacao transacao, PoolDeConexao pool) implements Runnable {

    @Override
    public void run() {
        synchronized (pool) {
            System.out.println("conexao: Tarefa Acesso Banco");
            pool.getConnection();
            synchronized (transacao) {
                System.out.println("transacao: Tarefa Acesso Banco");
                transacao.begin();
                transacao.commit();
            }
        }
    }
}
