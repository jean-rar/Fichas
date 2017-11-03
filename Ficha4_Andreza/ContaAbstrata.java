package Ficha4_Andreza;

public abstract class ContaAbstrata {
    private String nConta;
    private double saldo;
    private Cliente cliente;


    public ContaAbstrata(String nConta, double saldo, Cliente cliente){
        this.nConta = nConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public abstract double obterLimite();


    public boolean depositar(double valor){
        if(valor > 0){
            this.setSaldo(this.saldo + valor);
            return true;
        }
        return false;
    }

    public boolean sacar (double valor){
        if(valor > 0 && valor < obterLimite()){
            this.setSaldo(this.saldo-valor);
            return true;
        }
        return false;
    }

    public String toString(){
        String string = new String();

        string += "Cliente: " + this.getCliente() + "\n";
        string += "Número da conta: " + this.getnConta() + "\n";
        string += "Saldo: " + this.getSaldo() + "\n";

        return string;
    }

}
