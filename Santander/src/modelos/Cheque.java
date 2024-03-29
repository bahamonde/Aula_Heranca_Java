package modelos;

public class Cheque {

    //   -------------------------------- ATRIBUTOS ---------------

    private double valor;
    private String bancoEmissor;
    private  String dataPagamento;


    //   -------------------------------- GET E SETS ---------------

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

 //   -------------------------------- CONSTRUTOR ---------------------------------


    public Cheque(double valor, String bancoEmissor, String dataPagamento) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.dataPagamento = dataPagamento;
    }
}
