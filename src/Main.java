import Question03.Professor;
import Question03.TiposAlunos.Bolsista;
import Question03.TiposAlunos.Regular;
import Question03.Visitante;
import Question04.Turma;
import Questions01And02.Disciplina;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("1234", "Logica", "primeiro");
        Disciplina disciplina2 = new Disciplina("5678", "POO", "primeiro");
        Disciplina disciplina3 = new Disciplina("9101", "Java", "segundo");

        // Alunos
        Regular alunoRegular1 = new Regular("123456789", "Lucas", 21, "01234", 3);
        Regular alunoRegular2 = new Regular("987654321", "Maria", 18, "56789", 4);
        Bolsista alunoBolsista1 = new Bolsista("876543213", "João", 22, "76321", 0);

        //Professor
        Professor professor = new Professor("688973020", "Antonio", 56, "pesquisa", 12);

        // Visitante
        Visitante visitante1 = new Visitante("6473628289", "Joana", 43);
        Visitante visitante2 = new Visitante("756383958", "Luana", 16);

        // Turmas
        Turma turmaLogica = new Turma("1243",disciplina1, professor);
        Turma turmaPoo = new Turma("5678", disciplina2, professor);
        Turma turmaJava = new Turma("5678", disciplina3, professor);

        turmaLogica.adicionarAluno(alunoBolsista1);
        turmaLogica.adicionarAluno(alunoRegular1);
        turmaLogica.adicionarAluno(alunoRegular2);

        turmaPoo.adicionarAluno(alunoBolsista1);
        turmaPoo.adicionarAluno(alunoRegular1);
        turmaPoo.adicionarAluno(alunoRegular2);

        turmaJava.adicionarAluno(alunoBolsista1);
        turmaJava.adicionarAluno(alunoRegular1);
        turmaJava.adicionarAluno(alunoRegular2);

        // Print
        System.out.println("Disciplina dados: " +'\n'  + "Displina nome: " + turmaLogica.getDisciplina().getNome()  + '\n' + "Displina Código: " + turmaLogica.getCodigo() + '\n' + "Professor: " + turmaLogica.getProfessor().getNome());
        System.out.println("Alunos: " + turmaLogica.listarAlunos());
        System.out.println();
        System.out.println( "Disciplina dados: " + '\n' + "Displina nome: " + turmaPoo.getDisciplina().getNome()  + '\n' + "Displina Código: " + turmaPoo.getCodigo() + '\n' + "Professor: " + turmaPoo.getProfessor().getNome());
        System.out.println("Alunos: " + turmaPoo.listarAlunos());
        System.out.println();
        System.out.println( "Disciplina dados: " + '\n' + "Displina nome: " + turmaJava.getDisciplina().getNome()  + '\n' +  "Displina Código: " + turmaJava.getCodigo() + '\n' + "Professor: " + turmaJava.getProfessor().getNome());
        System.out.println("Alunos: " + turmaJava.listarAlunos());
    }
}