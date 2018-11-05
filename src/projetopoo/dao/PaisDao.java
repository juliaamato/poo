
package projetopoo.dao;

import java.util.ArrayList;
import projetopoo.Pais;

public class PaisDao {
    private ArrayList<Pais> pais = new ArrayList();

    public void inserir(Pais pai) {
        if (!pais.contains(pai)) {
            pais.add(pai);
        }
    }

    public String procurar(String usuario) {
        String n = null;
        for (int i = 0; i < pais.size(); i++) {
            if (usuario.equals(pais.get(i).getUsuario())) {
                n = pais.get(i).getSenha();
            }
        }
        return n;
    }

    public ArrayList<String> pegarMatricula(String usuario) {
        ArrayList <String> matricula = new ArrayList();
        for (int i = 0; i < pais.size(); i++) {
            if (usuario.equals(pais.get(i).getUsuario())) {
                matricula = pais.get(i).getAlunos();
            }
        }
        return matricula;
    }
}
