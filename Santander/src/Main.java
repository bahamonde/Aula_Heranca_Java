import modelos.Cliente;
import modelos.ContaPoupanca;

public class Main {

    public static void main(String[] args){

        Cliente jaiminho = new Cliente(12345, "Jaime", "Carteiro", "32.555.878-X", "345.887.564-90");

        ContaPoupanca contaPoupancaDoJaiminho = new ContaPoupanca(1000);

        System.out.println("O seu saldo é de " + contaPoupancaDoJaiminho.consultar());
        System.out.println("Seu saldo após o saque é " + contaPoupancaDoJaiminho.sacar(150));


    }
}
