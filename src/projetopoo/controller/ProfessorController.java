package projetopoo.controller;

import projetopoo.Professor;
import projetopoo.dao.PessoaDao;
import projetopoo.dao.ProfessorDao;
import projetopoo.dao.TurmaDao;

public class ProfessorController {
    private final ProfessorDao profDao = new ProfessorDao();
    private final PessoaDao pessoaDao = new PessoaDao();
    private final TurmaDao turmaDao = new TurmaDao();
    private final AlunoController alunoCon = new AlunoController();
    public String procurar(String usuario){
        String i = profDao.procurar(usuario);
        return i;
    }
    
    public double[] procurarMatricula(String matricula){
        double nota[] = null;
        nota = alunoCon.procurarMatricula(matricula);
        return nota;
    }
    
    public void adicionarDado(double nota[], String cod){
        alunoCon.adicionarDado(nota, cod);
    }
    
    public double calcularMedia(String cod){
        double media = alunoCon.calcularMedia(cod);
        return media;
    }

    public void adicionarDado(String observacao, String cod) {
        alunoCon.adicionarDado(observacao, cod);
    }

    public boolean procurarNaTurma(String cod, String usuario) {
        boolean i = false;
        i = turmaDao.procurarAluno(cod, usuario);
        return i;
    }
    
    public void cadastro(Professor prof) {
        profDao.inserir(prof);
        pessoaDao.inserir(prof);
    }
    
}
