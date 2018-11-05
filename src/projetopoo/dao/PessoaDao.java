package projetopoo.dao;

import java.util.ArrayList;
import projetopoo.Pessoa;

public class PessoaDao {

    private ArrayList<Pessoa> pessoas = new ArrayList();

    public void inserir(Pessoa pessoa) {
        if (!pessoas.contains(pessoa)) {
            pessoas.add(pessoa);
        }
    }
    
    public void alterar(Pessoa pessoa) {

    }
}
