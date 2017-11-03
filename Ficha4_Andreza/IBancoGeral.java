package Ficha4_Andreza;

public interface IBancoGeral {

    public ContaAbstrata abrirConta (Cliente c, String nConta, double saldoInicial, String tipo);

    public boolean depositar (ContaAbstrata c, double valor);

    public boolean sacar (ContaAbstrata c, double valor);

}
