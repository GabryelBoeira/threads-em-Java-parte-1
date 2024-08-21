package br.com.alura.banheiro;

public class Banheiro {

    private boolean estaSujo = true;

    public void fazerNumero1() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + ": batendo na porta");

        synchronized (this) {
            while(estaSujo) esperarLimpeza(nome);

            System.out.println(nome + ": Entrando no banheiro");
            System.out.println(nome + ": Fazendo coisa rapida");
            pausarExecucao(2000);

            this.estaSujo = true;
            System.out.println(nome + ": dando descarga");
            System.out.println(nome + ": lavando a mão");
            System.out.println(nome + ": Saindo do banheiro");
        }
    }

    public void fazerNumero2() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + ": batendo na porta");

        synchronized (this) {
            while(estaSujo) esperarLimpeza(nome);

            System.out.println(nome + ": Entrando no banheiro");
            System.out.println(nome + ": Fazendo coisa demorada");
            pausarExecucao(8000);

            this.estaSujo = true;
            System.out.println(nome + ": dando descarga");
            System.out.println(nome + ": lavando a mão");
            System.out.println(nome + ": Saindo do banheiro");
        }
    }

    public void limpar() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + ": batendo na porta");

        synchronized (this) {
            if (!estaSujo) {
                System.out.println(nome + ": Banheiro ja esta limpo");
                return;
            }

            System.out.println(nome + ": Entrando no banheiro");
            System.out.println(nome + ": Limpando o banheiro");
            this.estaSujo = false;
            pausarExecucao(4000);
            System.out.println(nome + ": Saindo do banheiro");
            this.notifyAll();
        }
    }

    private void esperarLimpeza(String nome) {
        System.out.println(nome + ": banheiro esta sujo");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Pauses the execution of the current thread for a specified amount of time.
     *
     * @param millis the number of milliseconds to pause the execution
     */
    private static void pausarExecucao(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
