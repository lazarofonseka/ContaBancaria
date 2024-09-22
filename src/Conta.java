public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private double limite;

    public Conta(String titular,int numero,double saldo,double limite){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo(){
        return  saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public void imprimirInformacoes(){
        System.out.println("Titular" + this.titular);
        System.out.println("Numero" + this.numero);
        System.out.println("Saldo" + this.saldo);
        System.out.println("Limite" + this.limite);
    }
}
