
package projetopoo;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
      StringBuilder sb = new StringBuilder();
      
        StringBuilder append = sb.append("{nome: ").append(this.nome).append(", cpf: ").append(this.cpf);
      return sb.toString();
    }
    
    
}
