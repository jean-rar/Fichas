package Ficha4_Andreza;
import java.util.Scanner;

public class Teste {

    public static Scanner input = new Scanner (System.in);
    private static IBancoGeral iBancoGeral = new BancoNovaRoma();

    public static void main(String []args){
        Cliente c = new Cliente();
        System.out.print("Informe seu nome: ");
        c.setNome(input.next());
        System.out.print("Informe seu cpf: ");
        c.setCpf(input.next());
        System.out.print("Informe o número da sua conta: ");
        String nConta = input.next();
        System.out.print("Informe seu Saldo: ");
        double saldoI = input.nextDouble();
        System.out.print("informe o tipo da conta: ");
        String tipo = input.next();

        ContaAbstrata ca = iBancoGeral.abrirConta(c, nConta, saldoI, tipo );

        System.out.print("O que deseja fazer? 1)Sacar 2)Depositar ");
        String opcao = input.next();
        if(opcao.equalsIgnoreCase("1")){
            System.out.print("valor do saque: " + sacar(ca));
        }else if(opcao.equalsIgnoreCase("2")){
            System.out.print("valor do deposito: "+ depositar(ca));
        }

    }

    private static double sacar(ContaAbstrata ca) {
        System.out.print("Informe o valor do saque: ");
        double valor = input.nextDouble();
        if(valor <= 0){
            System.out.print("Valor Inválido");
        }else{
            ca.sacar(valor);
            System.out.print(ca);
        }
        return valor;
    }

    private static double depositar(ContaAbstrata ca){
        System.out.print("Informe o valor do deposito: ");
        double valor = input.nextDouble();
        if(valor <= 0){
            System.out.print("Valor Inválido");
        }else{
            ca.depositar(valor);
            System.out.print(ca);
        }
        return valor;
    }
}
