package Question03;

import Questions01And02.Pessoa;

public class Professor extends Pessoa {
    private String centro;
    private int aulasMes = 0;
    public  Professor(String nome, String cpf, int idade){
        super(nome, cpf, idade);
        this.centro = centro;
        this.aulasMes = aulasMes;
    }

    public void ministrarAula() {
        int aulas = aulasMes + 1;
    }
}
