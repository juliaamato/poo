
package projetopoo.interfacee;

import projetopoo.Aluno;


public interface InterfaceAluno {
    public void inserir(Aluno aluno);
    public double[] procurarMatricula(String matricula);
    public void adicionarDado(double[] nota, String cod);
    public void salvarMedia(double media, String cod);
    public String procurarNome(String matricula);
    public void adicionarDado(String observacao, String cod);
    public String pegarObs(String matricula);
}
