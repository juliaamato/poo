package projetopoo.view;

import java.util.Scanner;
import projetopoo.Professor;
import projetopoo.Turma;
import projetopoo.controller.TurmaController;

public class ViewTurmaCadastro {
    //private final Scanner scan = new Scanner(System.in);
    private final TurmaController tc = new TurmaController();
    private final Scanner pegaString = new Scanner(System.in);
    public void cad(Professor prof){
        /*System.out.println("Informe quantos alunos essa turma tem");
        int qtd = scan.nextInt();
        t.setQtdAlunos(qtd);*/
        System.out.println("Informe o codigo da turma");
        String cod = pegaString.nextLine();
        Turma t = new Turma(prof, cod);
        t.setCodigo(cod);
        t.setAlunos(null);
        tc.cadastro(t);
        prof.setTurma(t);
    }
}
