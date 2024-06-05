package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.GerenciadorProdutos;

public class MenuGerenciadorProdutos {

    static Scanner scan = new Scanner(System.in); 

    public  void exibirMenu() { 
        int opcao;

        do {
            System.out.println("\n==== Inventory WareHouse ====");
            System.out.println("1. Cadastrar");
            System.out.println("2. Editar");
            System.out.println("3. Excluir");
            System.out.println("4. Pesquisar");
            System.out.println("5. Voltar para o menu principal");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scan.nextInt();
                scan.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

                switch (opcao) {
                    case 1:
                        new GerenciadorProdutos().cadastrarProduto();
                        break;
                    case 2:
                        new GerenciadorProdutos().editarProduto();
                        break;
                    case 3:
                        new GerenciadorProdutos().excluirProduto(); // Corrigido o nome do método
                        break;
                    case 4:
                        new GerenciadorProdutos().pesquisarProduto();
                        break;
                    case 5:
                        System.out.println("Voltando para o menu principal...");
                        new MenuPrincipal().exibirMenu(); // Chame o método exibirMenu do MenuPrincipal
                        return; // Saia do método para evitar execução desnecessária
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) { // Use InputMismatchException para entrada inválida
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scan.nextLine(); // Limpar o buffer do scanner
            }

        } while (true); // Loop infinito até que o usuário escolha a opção 5
    }
}
