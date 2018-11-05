package projetopoo.view;

import java.util.Scanner;

public class ViewGeral {
    private final ViewProfessorMenu prof = new ViewProfessorMenu();
    private final ViewPaiMenu pai = new ViewPaiMenu();
    private final Scanner scanf = new Scanner(System.in);
    public void menu() {
        int resp;
        do{
            System.out.println("Selecione uma opcao:");
            System.out.println("1-Professor");
            System.out.println("2-Pai");
            System.out.println("3-Sair");
             resp = scanf.nextInt();
            switch (resp) {
                case 1:
                    prof.menu();
                    break;
                case 2:
                    pai.menu();
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
