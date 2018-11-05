package projetopoo.view;

import java.util.Scanner;
import projetopoo.Aluno;
import projetopoo.Pais;
import projetopoo.controller.AlunoController;

public class ViewAlunoCad {

    private final Scanner pegaString = new Scanner(System.in);
    private final Aluno aluno = new Aluno();
    private final AlunoController alunoCon = new AlunoController();
    private double nota[] = new double[4];

    public Aluno cad(Pais pai) {
        boolean i, j;
        System.out.println("Informe a turma do seu filho");
        String turma = pegaString.nextLine();
        i = alunoCon.procuraTurma(turma);
        if (i == true) {
            aluno.setTurma(turma);
            System.out.println("Informe o nome de seu filho");
            String nome = pegaString.nextLine();
            aluno.setNome(nome);
            System.out.println("Informe a matricula de seu filho");
            String matricula = pegaString.nextLine();
            aluno.setMatricula(matricula);
            nota[0] = -1;
            nota[1] = -1;
            nota[2] = -1;
            nota[3] = -1;
            aluno.setNota(nota);
            j = alunoCon.inserir(aluno);
            if (j == true) {
                System.out.println(aluno.getNome() + "foi cadastrado com sucesso na turma" + aluno.getTurma());
                return aluno;
            } else
                System.out.println(aluno.getNome() + "nao foi cadastrado");
        }
        else
            System.out.println("Turma nao registrada");
        return null;
    }
}
