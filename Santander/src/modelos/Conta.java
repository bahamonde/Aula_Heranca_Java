package modelos;

// ----------------------------------- ATRIBUTOS --------------------------------------

public abstract class Conta {

    private Cliente cliente;
    protected double saldo; //precisa ser protected para poder chamar para reescrever o metodo sacar depois

// ------------------------------------- Construtores VAZIOS -------------------------------

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public Conta (){

    }

    // --------------------------------------- GET E SETS---------------------------------
    public Cliente getCliente() {  //toda conta tem um cliente, entao tem que chamar o cliente dentro da conta
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //-------------------------------------- METODOS -------------------------------------

    public void depositar(double valor) {   // esse deixa normal pq nao vai precisar ser reescrito


        this.saldo +=valor;


    }



    public abstract double sacar(double valor);  // isso obriga a ter que reescrever o metodo na classe filha @override

        /* Quando for usar  UM METODO ABSTRADO em outra classe, tem que implementar os metodos
        abstrados 'generate - implement - escolhe os metodos */


        // this.saldo -= valor;    // isso é o mesmo que "this.saldo = this.saldo - valor" (TIREI para usar o metodo abstrado)




    public double consultar() {   // tira o void pq vai retornar um valor ////// // Se vc deixar o metodo abstrato "public abstract double consultar()"
        // e nao pode ter nada dentro, tem que ser vazio. É como uma etiqueta avisando que é obrigatorio reescrever o
        // que está dentro do metodo. Sem o abstract vc pode reescrever ou deixar o methodo como vc fez na classe pai

        return this.saldo  ;     // usa o return e chama o sout no main
    }

}
