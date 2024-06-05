package view;

import java.util.Scanner;

public class MenuPrincipal extends MenuGerenciadorProdutos{

	public void exibirMenu() {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		try {
			do {
				System.out.println("");
				System.out.println("==== MENU PRINCIPAL ====");
				System.out.println("1. Inventory WareHouse");
				System.out.println("2. Sair");
				System.out.print("Escolha uma opção: ");

				opcao = scan.nextInt();

				switch (opcao) {
				case 1:
					MenuGerenciadorProdutos produtos = new MenuGerenciadorProdutos();
					produtos.exibirMenu();
					break;
				case 2:
					System.out.println("Encerrando o Sistema...");
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}

			} while (opcao != 3);

		} catch (Exception erro) {

			System.out.println("Entrada inválida. Por favor, insira um número válido de acordo com o menu.");
		} finally {
			exibirMenu();
			scan.close();

		}

	}
}