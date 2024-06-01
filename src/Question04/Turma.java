package Question04;

import Question03.Aluno;
import Question03.Professor;
import Questions01And02.Disciplina;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(String codigo, Disciplina disciplina, Professor professor){
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
    }
    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }

    public ArrayList<String> listarAlunos(){
        ArrayList<String> nome = new ArrayList<String>();
        for(Aluno aluno: alunos){
            nome.add(aluno.getNome());
        }
        return nome;
    }

    public String getCodigo () {
        return this.codigo;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }
}
