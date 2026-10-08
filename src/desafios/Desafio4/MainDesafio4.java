package desafios.Desafio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainDesafio4 {

    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            limparTela();
            TipoHabilidade habilidade = null;
            System.out.println("===== CADASTRO DE NINJAS ====");
            System.out.println();
            System.out.println("1 Adicionar ninja.");
            System.out.println("2 Mostrar lista.");
            int menuDeOpcoes = lerInteiro(input);
            System.out.println();
            switch (menuDeOpcoes) {
                case 1:
                    System.out.println("Digite o nome do ninja.");
                    String nome = input.nextLine();
                    System.out.println("Digite a idade do ninja:");
                    int idade = lerInteiro(input);
                    boolean menuHabilidadeValido = false;
                    while (!menuHabilidadeValido) {
                        System.out.println("Qual sua principal habilidade?");
                        System.out.println();
                        System.out.println("1 - TAIJUTSU");
                        System.out.println("2 - NINJUTSU");
                        System.out.println("3 - GENJUTSU");
                        System.out.println("4 - KATON");
                        System.out.println("5 - RINNEGAN");
                        int opcaoHabilidade = lerInteiro(input);
                        switch (opcaoHabilidade) {
                            case 1:
                                habilidade = TipoHabilidade.TAIJUTSU;
                                break;
                            case 2:
                                habilidade = TipoHabilidade.NINJUTSU;
                                break;
                            case 3:
                                habilidade = TipoHabilidade.GENJUTSU;
                                break;
                            case 4:
                                habilidade = TipoHabilidade.KATON;
                                break;
                            case 5:
                                habilidade = TipoHabilidade.RINNEGAN;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                        if (habilidade != null) {
                            menuHabilidadeValido = true;
                        }
                    }
                    boolean basicoOuNao = false;
                    while (!basicoOuNao) {
                        System.out.println();
                        System.out.println("O seu ninja é de nível básico ou já é um ninja avançado?");
                        System.out.println("1 - Básico.");
                        System.out.println("2 - Avançado.");
                        int tipoNinja = lerInteiro(input);
                        if (tipoNinja == 1) {
                            NinjaBasico ninja = new NinjaBasico(nome, idade, habilidade);
                            ninjas.add(ninja);
                            basicoOuNao = true;
                        } else if (tipoNinja == 2) {
                            System.out.println("Qual a especialidade dele?");
                            String especialidade = input.nextLine();
                            NinjaAvancado ninja = new NinjaAvancado(nome, idade, habilidade, especialidade);
                            ninjas.add(ninja);
                            basicoOuNao = true;
                        } else {
                            System.out.println("Opção inválida, tente novamente.");
                        }
                    }
                    limparTela();
                    System.out.println("Ninja adicionado com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado até o momento, tente adicionar alguns!");
                        System.out.println();
                    } else {
                        System.out.println("Ninjas cadastrados até o momento:");
                        for (Ninja nlistaNinjas : ninjas) {
                            nlistaNinjas.mostrarInformacoes();
                            nlistaNinjas.executarHabilidade();
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Deseja voltar ao menu inicial? [ S / N ]");
            String voltarMenu = input.nextLine();
            while (!voltarMenu.equalsIgnoreCase("n") && !voltarMenu.equalsIgnoreCase("s")) {
                System.out.println("Digite uma resposta válida.");
                voltarMenu = input.nextLine();
            }
            if (voltarMenu.equalsIgnoreCase("n")) {
                limparTela();
                continuar = false;
                System.out.println("Encerrando o sistema, obrigado pela visita!");
            }
        }
        input.close();
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static int lerInteiro(Scanner input) {
        while (true) {
            try {
                int numero = input.nextInt();
                input.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite um numero válido, por favor.");
                input.nextLine();
            }
        }
    }
}





