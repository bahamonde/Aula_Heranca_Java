package modelos;

public class ContaPoupanca extends Conta { //Está herdando os atributos e metodos da classe 'Conta'

    private static double taxaJuros = 0.03;  // um atributo que só tem aqui nessa classe. /Foi criado como
    // constante pq a taxa de juros da poupança é sempre a mesma


  //  ----------------------------------------- Construtor vazio ----------------------------

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

  // ------------------------- GET E SET -------------------------------
    public static double getTaxaJuros() { // DEFAULT
        return taxaJuros;
    }

    public static void setTaxaJuros(double taxaJuros) {
        ContaPoupanca.taxaJuros = taxaJuros;
    }


    // ----------------------------------------- REESCREVER O METODO ABSTRATO HERDADO ---------------------------

     // reescrevendo o metodo abstrato "sacar" da classe 'Conta'. Tá reescrevendo pq a classe 'ContaCorrente tbm vai
    //herdar esse metodo mas vai precisar alterar pra permitir sacar do cheque especial caso nao tenha saldo. Aqui precisa ter saldo!!!

    @Override
    public void depositar(double valor) { //esse é o implemento desse atributo herdado

    }

    @Override
    public /*void */ double sacar(double valor) { //Qdo a reescricao vai reornar algo, tem que tirar o "void" da classe pai tbm
        this.saldo -= valor;
        return this.saldo;
    }


 //   --------------------------------------- METODO SÓ DESSA CLASSE -------------------

    public void recolherjuros() {
        this.taxaJuros = this.saldo;
    }
}



