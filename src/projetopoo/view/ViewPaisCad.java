package projetopoo.view;

import java.util.ArrayList;
import java.util.Scanner;
import projetopoo.Aluno;
import projetopoo.Pais;
import projetopoo.controller.PaisController;
import projetopoo.view.ViewAlunoCad;

public class ViewPaisCad {

    private final Scanner pegaString = new Scanner(System.in);
    private final ViewAlunoCad filhoCad = new ViewAlunoCad();
    private final PaisController pais = new PaisController();

    public void cadastro() {
        String resposta;
        System.out.println("Para que voce se cadastre, precisamos de que cadastre seu filho");
        ArrayList<String> aluno = new ArrayList();
        aluno = null;
        Pais pai = new Pais();
        Aluno cad = filhoCad.cad(pai);
        Aluno alu = new Aluno(cad);
        if (cad != null) {
            System.out.println("Agora que seu filho foi cadastrado, vamos realizar seu cadastro");
            System.out.println("Informe seu nome:");
            String nome = pegaString.nextLine();
            pai.setNome(nome);
            System.out.println("Informe seu cpf");
            String cpf = pegaString.nextLine();
            pai.setCpf(cpf);
            System.out.println("Escolha seu nome de usuario");
            String usuario = pegaString.nextLine();
            pai.setUsuario(usuario);
            System.out.println("Escolha sua senha");
            String senha = pegaString.nextLine();
            pai.setSenha(senha);
            resposta = pais.procurar(pai.getUsuario());
            if (resposta == null) {
                aluno = pai.getAlunos();
                aluno.add(alu.getMatricula());//nao funciona add
                pais.cadastro(pai);
                System.out.println("aqui todos?"+ pai.getAlunos());
            } else {
                System.out.println("Usuario ja cadastrado");
            }
        }
    }
}
