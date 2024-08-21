package br.com.alura.banheiro;

public class Banheiro {

    private boolean estaSujo = true;

    public void fazerNumero1() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + ": batendo na porta");

        synchronized (this) {
            System.out.println(nome + ": Entrando no banheiro");

            if (estaSujo) esperarLimpeza(nome);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + ": dando descarga");
            System.out.println(nome + ": lavando a mão");
            System.out.println(nome + ": Saindo do banheiro");
        }
    }

    public void fazerNumero2() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + ": batendo na porta");

        synchronized (this) {

            System.out.println(nome + ": Entrando no banheiro");
            System.out.println(nome + ": Fazendo coisa demorada");

            if (estaSujo) esperarLimpeza(nome);

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

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
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

}
