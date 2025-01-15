package br.com.api;

public class Contato {
    private String CPF;
    private String nome;
    private int idade;

    public Contato(String CPF, String nome, int idade) {
        setCPF(CPF);
        setNome(nome);
        setIdade(idade);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString (){
        return "CPF: " + this.CPF + ", nome: " + this.nome + ", idade: " + this.idade;
    }
}
