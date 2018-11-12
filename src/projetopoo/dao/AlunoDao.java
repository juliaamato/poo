package projetopoo.dao;

import java.util.ArrayList;
import projetopoo.Aluno;
import projetopoo.interfacee.InterfaceAluno;

public class AlunoDao implements InterfaceAluno{

    private ArrayList<Aluno> alunos = new ArrayList();
    
   @Override
    public void inserir(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }
    
    @Override
    public double[] procurarMatricula(String matricula) {
        double nota[] = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (matricula.equals(alunos.get(i).getMatricula())) {
                nota = alunos.get(i).getNota();
                return nota;
            }
        }
        return nota;
    }

    @Override
    public void adicionarDado(double[] nota, String cod) {
        for (int i = 0; i < alunos.size(); i++) {
            if (cod.equals(alunos.get(i).getMatricula())) {
                nota[3] = -1;
                alunos.get(i).setNota(nota);
            }
        }
    }

    @Override
    public void salvarMedia(double media, String cod) {
        double nota[] = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (cod.equals(alunos.get(i).getMatricula())) {
                nota = alunos.get(i).getNota();
                nota[3] = media;
                alunos.get(i).setNota(nota);
            }
        }
    }

    @Override
    public String procurarNome(String matricula) {
        String nome = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (matricula.equals(alunos.get(i).getMatricula())) {
                nome = alunos.get(i).getNome();
                return nome;
            }
        }
        return nome;
    }

    @Override
    public void adicionarDado(String observacao, String cod) {
        for (int i = 0; i < alunos.size(); i++) {
            if (cod.equals(alunos.get(i).getMatricula())) {
                alunos.get(i).setObservacao(observacao);
            }
        }
    }

    @Override
    public String pegarObs(String matricula) {
        String observacao = null;
        for (int i = 0; i < alunos.size(); i++) {
            if (matricula.equals(alunos.get(i).getMatricula())) {
                observacao = alunos.get(i).getObservacao();
                return observacao;
            }
        }
        return observacao;
    }
}
