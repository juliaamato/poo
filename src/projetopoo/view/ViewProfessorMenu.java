package projetopoo.view;

import java.util.Scanner;

    public class ViewProfessorMenu {
    
    private final Scanner scan = new Scanner(System.in);
    private final ViewProfessorCadastro cad = new ViewProfessorCadastro();
    private final ViewProfessorLogin log = new ViewProfessorLogin();
    public void menu(){
        int resp;
        do{
            System.out.println("Selecione:");
            System.out.println("1-Cadastrar");
            System.out.println("2-Entrar");
            System.out.println("3-Sair");
            resp = scan.nextInt();
            switch (resp) {
                case 1:
                    cad.cadastro();
                    break;
                case 2:
                    log.login();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida, Digite novamente");
                    break;
            }
        }while(resp != 3);
    }
}
