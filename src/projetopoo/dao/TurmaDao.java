package projetopoo.dao;

import java.util.ArrayList;
import projetopoo.Aluno;
import projetopoo.Turma;

public class TurmaDao {

    private static ArrayList<Turma> turma = new ArrayList();//JULIA ARRUMA AQUI
    private ArrayList<Aluno> alunos = new ArrayList();

    
    public void inserir(Turma t) {
        if (!turma.contains(t)) {
            turma.add(t);
        }
    }

    public boolean procurarTurma(String turma) {
        for (int i = 0; i < TurmaDao.turma.size(); i++) {
            if (turma.equals(TurmaDao.turma.get(i).getCodigo())) {
                return true;
            }
        }
        return false;
    }

    public boolean adicionarAluno(Aluno aluno) {
        int i;
        for (i = 0; i < turma.size(); i++) {
            if (aluno.getTurma().equals(turma.get(i).getCodigo())) {
                if (turma.get(i).getAlunos() != null) {
                    for (int j = 0; j < turma.get(i).getAlunos().size(); j++) {
                        if (aluno.getMatricula().equals(turma.get(i).getAlunos().get(j).getMatricula())) {
                            return false;
                        }
                    }
                }
                turma.get(i).getAlunos();
                alunos.add(aluno);
                turma.get(i).setAlunos(alunos);
                return true;
            }
        }
        return false;
    }
//PERGUNTAR TJ

    public boolean procurarAluno(String cod, String usuario) {
        for (int i = 0; i < TurmaDao.turma.size(); i++) {
            if (usuario.equals(TurmaDao.turma.get(i).getProfessor().getUsuario())) {
                for (int j = 0; j < turma.get(i).getAlunos().size(); j = j + 1) {
                    if (cod.equals(turma.get(i).getAlunos().get(j).getMatricula())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
