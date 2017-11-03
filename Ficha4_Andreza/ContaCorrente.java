package Ficha4_Andreza;

public class ContaCorrente extends ContaAbstrata {

    private double limiteChequeEspecial = 100;

    public ContaCorrente(String nConta, double saldo, Cliente cliente){
        super(nConta, saldo, cliente);
    }

    @Override
    public double obterLimite() {
        return this.limiteChequeEspecial+this.getSaldo();
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public String toString(){
        String string = new String();

        string += "Cliente: " + this.getCliente() + "\n";
        string += "Número da conta: " + this.getnConta() + "\n";
        string += "Limite Cheque Especial: " + this.limiteChequeEspecial + "\n";
        string += "Saldo: " + this.getSaldo() + "\n";

        return string;
    }
}
