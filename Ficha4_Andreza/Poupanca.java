package Ficha4_Andreza;

public class Poupanca extends ContaAbstrata {

    public Poupanca(String nConta, double saldo, Cliente cliente){
        super(nConta, saldo, cliente);
    }

    @Override
    public double obterLimite() {
        return this.getSaldo();
    }

    public String toString(){
        String string = new String();

        string += "Cliente: " + this.getCliente() + "\n";
        string += "Número da conta: " + this.getnConta() + "\n";
        string += "Saldo: " + this.getSaldo() + "\n";

        return string;
    }
}
