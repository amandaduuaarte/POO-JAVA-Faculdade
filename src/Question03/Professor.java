package Question03;

import Questions01And02.Pessoa;

public class Professor extends Pessoa {
    private String centro;
    private int aulasMes = 0;
    public  Professor( String cpf, String nome, int idade, String centro, int aulasMes){
        super(cpf, nome, idade);
        this.centro = centro;
        this.aulasMes = aulasMes;
    }

    public String getCentro(){
        return this.centro;
    }

    public int getAulasMes (){
        return this.aulasMes;
    }

    public void setCentro() {
        this.centro = centro;
    }

    public void setAulasMes() {
        this.aulasMes = aulasMes;
    }

    public void ministrarAula() {
        int aulas = this.aulasMes + 1;
    }
}
