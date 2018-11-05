package projetopoo;

import java.util.ArrayList;

public class Turma {

    private Professor professor;
    private String codigo;
    private ArrayList<Aluno> alunos;
    
    public Turma(){
        alunos = new ArrayList<>();
        this.codigo = "";
        this.professor = null;
    }

    public Turma(Professor prof, String codigo) {
        professor = prof;
        this.codigo = codigo;
        alunos = new ArrayList<>();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("{alunos: ").append(this.alunos).append(", professor: ").append(this.professor).append(", codigo").append(this.codigo);
        return sb.toString();
    }

}
