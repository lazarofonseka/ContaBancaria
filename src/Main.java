import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Matheus", 35021, 227950, 5500) ;
        c1.imprimirInformacoes();
        System.out.println("Imprimir Informações:\n");

        Conta c2 = new Conta("Titular", 552210, 30021, 20000);
        c2.imprimirInformacoes();
        System.out.println("\nImprimirInformacoes");
        Conta c3 = new Conta("Titular", 323507, 666554, 3000);
        c3.imprimirInformacoes();
        System.out.println("\n");
        Conta c4 = new Conta("Matheus", 3022115, 6546877, 3300);
        c4.imprimirInformacoes();
        System.out.println("\n");


        }
}