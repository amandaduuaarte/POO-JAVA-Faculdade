package Question03.TiposAlunos;

import Question03.Aluno;

public class Bolsista extends Aluno {
    public Bolsista(String cpf, String nome, int idade, String matricula, int mensalidadeAno){
        super(cpf, nome, idade, matricula, mensalidadeAno);
    }

    @Override
    public void pagarMensalidade(){
        super.pagarMensalidade();
    }
}
