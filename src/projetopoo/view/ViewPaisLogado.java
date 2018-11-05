/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo.view;

import java.util.ArrayList;
import java.util.Scanner;
import projetopoo.controller.PaisController;

class ViewPaisLogado {

    private final PaisController pais = new PaisController();
    private final Scanner scanf = new Scanner(System.in);

    void logado(String usuario) {
        String nome, observacao;
        int resposta = 0;
        double nota[] = null;
        int contador = 0;
        ArrayList<String> matricula;
        matricula = pais.pegarMatricula(usuario);
        do {
            System.out.println("1-Ver notas");
            System.out.println("2-Ver observacoes");
            System.out.println("3-Sair");
            resposta = scanf.nextInt();
            switch (resposta) {
                case 1:
                    for (int i = 0; i < matricula.size(); i = i + 1) {
                        nota = pais.pegarNotas(matricula.get(i));
                        nome = pais.pegarNome(matricula.get(i));
                        System.out.println("Nome: " + nome);
                        for (int j = 0; j < 4; j = j + 1) {
                            if (nota[j] != -1) {
                                contador = contador + 1;
                                if (j == 3) {
                                    System.out.println("Media: " + nota[4]);
                                } else {
                                    System.out.println("Nota " + (j + 1) + ": " + nota[j]);
                                }
                            }
                        }
                        if (contador == 0) {
                            System.out.println("Nenhuma nota a ser exibida");
                        }
                    }//JULIA vai ajeitar
                    break;
                case 2:
                    for (int i = 0; i < matricula.size(); i = i + 1) {
                        observacao = pais.pegarObs(matricula.get(i));
                        nome = pais.pegarNome(matricula.get(i));
                        System.out.println("Nome: " + nome);
                        System.out.println("Observacao: " + observacao);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Resposta invalida, digite novamente");
                    break;
            }
        } while (resposta != 3);
    }
}
