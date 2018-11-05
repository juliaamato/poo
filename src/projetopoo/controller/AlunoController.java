package projetopoo.controller;

import projetopoo.Aluno;
import projetopoo.dao.AlunoDao;
import projetopoo.dao.PessoaDao;

public class AlunoController {
    private final AlunoDao alunoDao = new AlunoDao();
    private final TurmaController turmaCon = new TurmaController();
    private final PessoaDao pessoaDao = new PessoaDao();
    public double[] procurarMatricula(String matricula) {
        double nota[] = null;
        nota = alunoDao.procurarMatricula(matricula);
        return nota;
    }

    void adicionarDado(double[] nota, String cod) {
        alunoDao.adicionarDado(nota, cod);
    }

    double calcularMedia( String cod) {
        double notas[] = null;
        notas = alunoDao.procurarMatricula(cod);
        double media = (notas[0] + notas[1] + notas[2])/3;
        alunoDao.salvarMedia(media,cod);
        return media;
    }


    public boolean procuraTurma(String turma) {
        boolean i = turmaCon.procuraTurma(turma);
        return i;
    }

    String procurarNome(String matricula) {
        String nome = null;
        nome = alunoDao.procurarNome(matricula);
        return nome;
    }

    void adicionarDado(String observacao, String cod) {
        alunoDao.adicionarDado(observacao, cod);
    }

    String pegarObs(String matricula) {
        String observacao = null;
        observacao = alunoDao.pegarObs(matricula);
        return observacao;
    }
    public boolean inserir(Aluno aluno) {
        boolean i = turmaCon.adicionarAluno(aluno);
        if (i == true) {
            alunoDao.inserir(aluno);
            pessoaDao.inserir(aluno);
            return true;
        }
        return false;
    }
}
