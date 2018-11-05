
package projetopoo;

public class Professor extends Pessoa {
    private Turma turma;
    private String matricula;
    private String usuario;
    private String senha;

    public Professor(){
        this.matricula = "";
        this.usuario = "";
        this.senha = "";
        this.turma = new Turma();
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString(){
      StringBuilder sb = new StringBuilder();
      
      sb.append("{turma: ").append(this.turma).append(", matricula: ").append(this.matricula)
              .append(", usuario: ").append(this.usuario).append(", senha").append(this.senha);
      return sb.toString();
    }
}
