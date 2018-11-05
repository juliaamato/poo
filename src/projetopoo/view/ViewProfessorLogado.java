package projetopoo.view;

import java.util.Scanner;
import projetopoo.controller.ProfessorController;

public class ViewProfessorLogado {

    private final Scanner scanf = new Scanner(System.in);
    private final Scanner pegaString = new Scanner(System.in);
    private final Scanner pegaDouble = new Scanner(System.in);
    private final ProfessorController proController = new ProfessorController();

    public void logado(String usuario) {

        int resp, resposta;
        double nota[] = null;
        String cod, observacao;
        do {
            System.out.println("Selecione uma opcao:");
            System.out.println("1-Adicionar e/ou editar notas");
            System.out.println("2-Calcular media");
            System.out.println("3-Adicionar observacao");
            System.out.println("4-Sair");
            resp = scanf.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Digite a matricula do aluno");
                    cod = pegaString.nextLine();
                    boolean volta = proController.procurarNaTurma(cod, usuario);
                    if (volta != true) {
                        System.out.println("Aluno nao cadastrado na turma");
                        break;
                    }
                    do {

                        nota = proController.procurarMatricula(cod);
                        for (int i = 0; i < 4; i = i + 1) {
                            if (nota[i] == -1) {
                                System.out.println(i + 1 + "-Nota nao cadastrada");
                            } else {
                                if(i!=3)
                                    System.out.println("Nota " + (i + 1) + ": " + nota[i]);
                                else
                                    System.out.println("Media: "  + nota[i]);
                            }
                        }
                        System.out.println("1-Editar nota 1");
                        System.out.println("2-Editar nota 2");
                        System.out.println("3-Editar nota 3");
                        System.out.println("4-Sair");
                        resposta = scanf.nextInt();
                        switch (resposta) {
                            case 1:
                                do {
                                    System.out.println("Digite a nova nota [1]");
                                    nota[0] = pegaDouble.nextDouble();
                                } while (nota[0] > 10 || nota[0] < 0);
                                break;
                            case 2:
                                do {
                                    System.out.println("Digite a nova nota [2]");
                                    nota[1] = pegaDouble.nextDouble();
                                } while (nota[1] > 10 || nota[1] < 0);
                                break;
                            case 3:
                                do {
                                    System.out.println("Digite a nova nota [2]");
                                    nota[2] = pegaDouble.nextDouble();
                                } while (nota[2] > 10 || nota[2] < 0);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                    } while (resposta != 4);
                    proController.adicionarDado(nota, cod);
                    break;
                case 2:
                    System.out.println("Digite a matricula do aluno que deseja calcular a media");
                    cod = pegaString.nextLine();
                    double media = proController.calcularMedia(cod);
                    System.out.println("Media do aluno: " + media);
                    break;
                case 3:
                    System.out.println("Digite a matricula do aluno que deseja alterar");
                    cod = pegaString.nextLine();
                    nota = proController.procurarMatricula(cod);
                    if (nota != null) {
                        System.out.println("Digite sua observacao:");
                        observacao = pegaString.nextLine();
                        proController.adicionarDado(observacao, cod);
                    } else {
                        System.out.println("Aluno nao cadastrado");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida, Digite novamente");
                    break;
            }
        } while (resp != 4);
    }
}
