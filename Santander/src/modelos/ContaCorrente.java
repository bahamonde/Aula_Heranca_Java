package modelos;

public class ContaCorrente extends Conta { //precisa implementar no generate-implemente- e seleciona o atributo sacar

    // ------------------------------------- ATRIBUTO QUE SÓ TEM NESSA CLASSE ----------------------
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }


    // -------------------------------- METODO SÓ DESSA CLASSE -------------------------------------

    public void depositarCheques(Cheque cheque) {

        super.saldo += cheque.getValor(); // SUPER é o mesmo que o this, só mais legal pq impressiona

    }


    // esse é o implemento do metodo 'sacar' e 'depositar' da classe que foi herdada

    @Override
    public void depositar(double valor) {

    }

    @Override
    public double sacar(double valor) {

        // VERSAO DA LAURA JAVEIRA

        if (valor > super.saldo && valor <= super.saldo + this.chequeEspecial) {
            return super.saldo -= valor;
        } else {
            return super.saldo -= valor;
        }
    }


        /* VERSAO DA KARINA (FUNCIONA TBM!!!)


        if (super.saldo >= valor) {
           return super.saldo -= valor;
        } else if (super.saldo +this.chequeEspecial >= valor) {

            double resultado = (super.saldo -= valor) * -1;
            return this.chequeEspecial -= resultado;
        }
        */


        /* VERSAO DA LORENA (FUNCIONA TBM!!!)

        if (valor > super.saldo && valor <= super.saldo + this.chequeEspecial) {
            this.chequeEspecial = (super.saldo + this.chequeEspecial) - valor;
        } else if (valor > super.saldo && valor > super.saldo + this.chequeEspecial) {
            System.out.println("Nao pode sacar!! ");
        } else {
            super.saldo -= valor;
        }

        */
}


