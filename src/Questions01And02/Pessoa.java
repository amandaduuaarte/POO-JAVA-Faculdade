package Questions01And02;

import Question03.Aluno;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public Pessoa(String cpf, String nome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setCpf() {
        this.cpf = cpf;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setIdade() {
        this.idade = idade;
    }

    public void incrementarIdade() {
        int i = idade + 1;
    }

    public void fazerAniversario() {
        incrementarIdade();
    }
}
