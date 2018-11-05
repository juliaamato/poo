package projetopoo;

public class Aluno extends Pessoa {
   private String matricula;
   private String turma;
   private String observacao;

    public Aluno() {
        this.matricula = "";
        this.nota = null;
        this.observacao = "";
        this.turma = "";
    }

    public String getObservacao() {
        return observacao;
    }
    
    public Aluno (Aluno alunos){
        this.matricula = alunos.matricula;
        this.nota = alunos.nota;
        this.observacao = alunos.observacao;
        this.turma = alunos.turma;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
   private double nota[] = new double [4];
    public String getMatricula() {
        return matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    
   
   @Override
    public String toString(){
      StringBuilder sb = new StringBuilder();
      
       StringBuilder append = sb.append("{matricula: ").append(this.matricula).append(", turma: ")
               .append(this.turma).append(", nota").append(this.nota);
      return sb.toString();
    }
}
