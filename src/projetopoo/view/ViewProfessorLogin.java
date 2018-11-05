package projetopoo.view;

import java.util.Scanner;
import projetopoo.controller.ProfessorController;

public class ViewProfessorLogin {

    private final Scanner pegaString = new Scanner(System.in);
    private final ProfessorController profConontroller = new ProfessorController();
    private final ViewProfessorLogado proflog = new ViewProfessorLogado();

    public void login() {
        String i;
        System.out.println("Digite seu nome de usuario");
        String usuario = pegaString.nextLine();
        i = profConontroller.procurar(usuario);
        //ver se pode ter aqui com tj
        if (i != null) {
            System.out.println("Digite a sua senha");
            String senha = pegaString.nextLine();
            if(senha.equals(i)){
                proflog.logado(usuario);
            }
            else
                System.out.println("Senha invalida");
        }
        else
            System.out.println("Usuario não cadastrado!");
    }
}
