import java.util.concurrent.atomic.AtomicReference;

public class ContaBancaria {

        String nome;
        int numero;
        int saldo;
        double limite;

       public ContaBancaria(String nome, int numero, int saldo, double limite) {
            this.nome =nome;
            this.numero =numero;
            this.saldo =saldo;
            this.limite =limite;
        }
        public String getNome () {
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getNumero() {
            return numero;
        }
        public void setNumero( int numero){
            this.numero = numero;
        }
        public int getSaldo() {
            return saldo;
        }
        public void setSaldo( int saldo){
            this.saldo = saldo;
        }
        public double getLimite() {
            return limite;
        }
        public void setLimite( double limite){
            this.limite = limite;


        }
        public void imprimirInformacoes () {
            System.out.println("Nome: " + this.nome);
            System.out.println("Numero:" + this.numero);
            System.out.println(("Saldo:" + this.saldo));
            System.out.println("Limite:" + this.limite);
        }
    }




