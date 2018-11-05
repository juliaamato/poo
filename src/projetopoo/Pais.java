
package projetopoo;

import java.util.ArrayList;

public class Pais extends Pessoa {
    private String usuario;
    private String senha;
    private ArrayList <String> alunos;
    
    public Pais(){
        usuario = "";
        senha = "";
        alunos = new ArrayList<String>();
    }

    public ArrayList<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<String> alunos) {
        this.alunos = alunos;
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
    
    @Override
    public String toString(){
      StringBuilder sb = new StringBuilder();
      
      sb.append("{filhos: ").append(this.alunos).append(", usuario: ").append(this.usuario).append(", senha").append(this.senha);
     
      return sb.toString();
    }

}
