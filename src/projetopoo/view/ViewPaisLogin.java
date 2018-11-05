
package projetopoo.view;

import java.util.Scanner;
import projetopoo.controller.PaisController;

class ViewPaisLogin {
    

    private final Scanner pegaString = new Scanner(System.in);
    private final PaisController pais = new PaisController();
    private final ViewPaisLogado pai = new ViewPaisLogado();
    
    public void login(){
        String i;
        System.out.println("Digite seu nome de usuario");
        String usuario = pegaString.nextLine();
        i = pais.procurar(usuario);
        if (i != null) {
            System.out.println("Digite a sua senha");
            String senha = pegaString.nextLine();
            if(senha.equals(i)){
                pai.logado(usuario);
            }
        }
        else
            System.out.println("Usuario não cadastrado!");
    }
}
