package Questions01And02;

public class Disciplina {
    private String codigo;
    private String nome;
    private String semestre;


    public Disciplina(String codigo, String nome, String semestre){
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }

    public String getSemestre(){
        return semestre;
    }

    public void setCodigo(){
        this.codigo = codigo;
    }

    public void setNome(){
        this.nome = nome;
    }

    public void setSemestre(){
        this.semestre = semestre;
    }

}
