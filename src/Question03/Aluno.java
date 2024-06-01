package Question03;

import Questions01And02.Pessoa;

public class Aluno extends Pessoa {
    private String matricula;
    private int mensalidadeAno = 12;
    public Aluno (String cpf, String nome, int idade, String matricula, int mensalidadeAno){
        super(cpf, nome,idade);
        this.matricula = matricula;
        this.mensalidadeAno = mensalidadeAno;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade (){
        int i = mensalidadeAno - 1;
    }
}
