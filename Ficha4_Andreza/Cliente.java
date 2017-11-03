package Ficha4_Andreza;

public class Cliente {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        String string = new String();

        string += "Nome: " + this.nome + "\n";

        return string;
    }
}
