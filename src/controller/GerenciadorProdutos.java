package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produtos;
import view.MenuGerenciadorProdutos;

public class GerenciadorProdutos extends MenuGerenciadorProdutos {
	private static List<Produtos> produtos = new ArrayList<>();

	// metodo para cadastrar Produtos

	public void cadastrarProduto() {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("Digite o nome do material: ");
			String material = scan.nextLine();

			System.out.println("Digite o nome do tipo: ");
			String type = scan.nextLine();

			System.out.println("Digite o nome da marca: ");
			String brand = scan.nextLine();

			System.out.println("Digite o nome da cor: ");
			String color = scan.nextLine();

			System.out.println("Digite a quantidade: ");
			int qnt = scan.nextInt();

			scan.nextLine();

			System.out.println("Digite um comentário: ");
			String comment = scan.nextLine();

			Produtos dadosprodutos = new Produtos(material, type, brand, color, qnt, comment);
			produtos.add(dadosprodutos);

			int tamanho = produtos.size();
			if (tamanho == 1) {

				System.out.println(tamanho + " Produto cadastrado com sucesso! ");
				// exibirProdutos();

			}

		} catch (Exception erro) {
			System.out.println("Erro ao cadastrar produto, tente novamente: ");
		} finally {
			exibirMenu();
			scan.close();
		}

	}

	// metodo editar produto
	public void editarProduto() {

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Digite o nome do produto a ser editado: ");
			String nome = scan.nextLine();

			boolean produtoEncontrado = false;
			for (Produtos dadosProduto : produtos) {
				if (dadosProduto.getMaterial().equalsIgnoreCase(nome)) {
					produtoEncontrado = true;
					System.out.println("Produto encontrado: ");
					System.out.println(dadosProduto);
					System.out.println("");
					System.out.println("O que deseja editar?");
					System.out.println("1. Material");
					System.out.println("2. Type");
					System.out.println("3. Brand");
					System.out.println("4. color");
					System.out.println("5. Quantity");
					System.out.println("6. Comment");
					System.out.println("7. Sair");

					int opcao = scan.nextInt();
					scan.nextLine();

					switch (opcao) {
					case 1:
						System.out.println("Escreva o novo nome do material: ");
						String novoNomeMaterial = scan.nextLine();

						dadosProduto.setMaterial(novoNomeMaterial);
						break;
					case 2:
						System.out.println("escreva o novo tipo: ");
						String novoTypeProduto = scan.nextLine();
						dadosProduto.setType(novoTypeProduto);
						break;
					case 3:
						System.out.println("escreva a nova marca: ");
						String novoBrandProduto = scan.nextLine();
						dadosProduto.setBrand(novoBrandProduto);
						break;

					case 4:
						System.out.println("escreva a nova cor: ");
						String novoColorProduto = scan.nextLine();
						dadosProduto.setColor(novoColorProduto);
						break;

					case 5:
						System.out.println("Escreva a nova quantidade: ");
						int novoQntProduto = scan.nextInt();
						dadosProduto.setQnt(novoQntProduto);
						break;

					case 6:
						System.out.println("Escreva o novo comentário: ");
						String novoCommentProduto = scan.nextLine();
						dadosProduto.setComment(novoCommentProduto);
						break;
					case 7:
						System.out.println("Voltando ao Menu de Cadastro: ");
						new MenuGerenciadorProdutos().exibirMenu();
						return;

					default:
						System.out.println("Opção inválida tente novamente.");
						break;
					}

					break;
				}
			}

			if (!produtoEncontrado) {
				System.out.println("Produto não encontrado.");
				editarProduto();
			}

		} catch (Exception erro) {
			System.out.println("Erro ao alterar dados do produto, tente novamente: ");
		} finally {

			editarProduto();
			scan.close();
		}
	}
	
	
	
	
//metodo para exluir produto
	public void excluirProduto() {
		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o nome do produto para excluir: ");
			String nome = scan.nextLine();

			boolean produtoEncontrado = false;
			for (Produtos dadosProduto : produtos) {
				if (dadosProduto.getMaterial().equalsIgnoreCase(nome)) {
					produtos.remove(dadosProduto);
					System.out.println("Produto removido com sucesso.");
					exibirMenu();
					produtoEncontrado = true;
					break;
				}
			}

			if (!produtoEncontrado) {
				System.out.println("Produto não encontrado para exclusão," + nome
						+ "não existe em nosso sistema, tente novamente!\"");

			}
			scan.close();

		} catch (Exception erro) {
			System.out.println("_____________________________________________________________________________");
			System.out.println("Erro ao excluir produto, tente noavamente");
		} finally {
			exibirMenu();

		}
	}
	
	
	
	

	// metodo para pesquisar Produtos
	public void pesquisarProduto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String nomeProduto = scan.nextLine();
		boolean produtoEncontrado = false;
		for (Produtos dadosProduto : produtos) {
			if (dadosProduto.getMaterial().equalsIgnoreCase(nomeProduto)) {
				System.out.println("Produto encontrado: ");
				System.out.println(dadosProduto);
				return;
			}
		}
		if (!produtoEncontrado) {
			System.out.println("_____________________________________________________________________________");
			System.out.println(nomeProduto + "<--");
			System.out.println("Produto não encontrado, o mesmo " + "não existe em nosso sistema, tente novamente!\"");
		}

	}

}