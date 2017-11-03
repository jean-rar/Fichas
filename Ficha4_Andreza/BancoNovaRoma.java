package Ficha4_Andreza;

public class BancoNovaRoma implements IBancoGeral {

    @Override
    public ContaAbstrata abrirConta(Cliente c, String nConta, double saldoInicial, String tipo) {
       ContaAbstrata ca = null;

        if(tipo.equalsIgnoreCase("corrente")){
            ca = new ContaCorrente(nConta, saldoInicial, c);
        }else if (tipo.equalsIgnoreCase("poupanca")){
            ca = new Poupanca(nConta, saldoInicial, c);
        }
        return ca;
    }

    @Override
    public boolean depositar(ContaAbstrata c, double valor) {
        c.depositar(valor);
        return false;
    }

    @Override
    public boolean sacar(ContaAbstrata c, double valor) {
        c.sacar(valor);
        return false;
    }

}
