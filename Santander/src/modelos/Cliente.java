package modelos;

// --------------------------------- ATRIBUTOS ------------------

public class Cliente {

    private int numero;
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;

 //  ------------------------------ GET E SETS -----------------------

    public int getNumCliente() {
        return numero;
    }

    public void setNumCliente(int numCliente) {
        this.numero = numCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // ----------------------------------- CONSTRUTOR


    public Cliente(int numero, String nome, String sobrenome, String rg, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }
}
