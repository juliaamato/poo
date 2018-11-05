package projetopoo.view;

import java.util.Scanner;
import projetopoo.Professor;
import projetopoo.controller.ProfessorController;

public class ViewProfessorCadastro {

    private final Professor prof = new Professor();
    private final Scanner scan = new Scanner(System.in);
    private final ViewTurmaCadastro turmaCad = new ViewTurmaCadastro();
    private final ProfessorController profCon = new ProfessorController();

    public void cadastro() {
        String n = null;
        System.out.println("Informe seu nome:");
        String nome = scan.nextLine();
        prof.setNome(nome);
        System.out.println("Informe seu cpf");
        String cpf = scan.nextLine();
        prof.setCpf(cpf);
        System.out.println("Informe sua matricula");
        String matricula = scan.nextLine();
        prof.setMatricula(matricula);
        System.out.println("Escolha seu nome de usuario");
        String usuario = scan.nextLine();
        prof.setUsuario(usuario);
        //checar se já existe usuario fazer funcao para isso
        System.out.println("Escolha sua senha");
        String senha = scan.nextLine();
        prof.setSenha(senha);
        n = profCon.procurar(usuario);
        if (n == null) {
            System.out.println("Informe os dados de sua turma");
            turmaCad.cad(prof);
            profCon.cadastro(prof);
        }
        else
            System.out.println("Usuario ja cadastrado");
    }
}
