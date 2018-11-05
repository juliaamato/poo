package projetopoo.view;

import java.util.Scanner;

public class ViewPaiMenu {
   private final ViewPaisCad cad = new ViewPaisCad();
   private final ViewPaisLogin pailog = new ViewPaisLogin();
   Scanner scan = new Scanner(System.in);
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
                    pailog.login();
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
