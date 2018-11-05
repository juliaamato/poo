/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo.dao;

import java.util.ArrayList;
import projetopoo.Professor;

public class ProfessorDao {

    private ArrayList<Professor> prof = new ArrayList();

    public void inserir(Professor pessoa) {
        if (!prof.contains(pessoa)) {
            prof.add(pessoa);
        }
    }

    public String procurar(String usuario) {
        String n = null;
        for (int i = 0; i < prof.size(); i++) {
            if (usuario.equals(prof.get(i).getUsuario())) {
                n = prof.get(i).getSenha();
            }
        }
        return n;
    }
}
