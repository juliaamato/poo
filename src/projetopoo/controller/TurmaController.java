package projetopoo.controller;

import projetopoo.Aluno;
import projetopoo.Turma;
import projetopoo.dao.TurmaDao;

public class TurmaController {
    
    private final TurmaDao turmaDao = new TurmaDao();

    public boolean procuraTurma(String turma) {
        boolean i = turmaDao.procurarTurma(turma);
        return i;
    }
    public boolean adicionarAluno(Aluno aluno) {
        boolean i;
        i = turmaDao.adicionarAluno(aluno);
        return i;
    }
    public void cadastro(Turma t){
        turmaDao.inserir(t);
    }

}
