package projetopoo.controller;

import java.util.ArrayList;
import projetopoo.Pais;
import projetopoo.dao.PaisDao;
import projetopoo.dao.PessoaDao;

public class PaisController {

    private final PessoaDao pessoaDao = new PessoaDao();
    private final PaisDao paiDao = new PaisDao();
    private final AlunoController alunoCon = new AlunoController();

    public void cadastro(Pais pai) {
        paiDao.inserir(pai);
        pessoaDao.inserir(pai);
    }

    public String procurar(String usuario) {
        String n = paiDao.procurar(usuario);
        return n;
    }

    public ArrayList<String> pegarMatricula(String usuario) {
        ArrayList<String> matricula;
        matricula = paiDao.pegarMatricula(usuario);
        return matricula;
    }

    public double[] pegarNotas(String matricula) {
        double nota[] = null;
        nota = alunoCon.procurarMatricula(matricula);
        return nota;
    }

    public String pegarNome(String matricula) {
        String nome = null;
        nome = alunoCon.procurarNome(matricula);
        return nome;
    }

    public String pegarObs(String matricula) {
        String observacao = null;
        observacao = alunoCon.pegarObs(matricula);
        return observacao;
    }

}
