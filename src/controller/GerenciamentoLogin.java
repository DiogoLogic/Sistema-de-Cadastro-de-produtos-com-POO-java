package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Login;
import view.MenuGerenciadorProdutos;

public class GerenciamentoLogin extends MenuGerenciadorProdutos {

    private static List<Login> usuarios = new ArrayList<>();

    // Método para cadastrar login de usuário
    public void cadastrarLoginUsuario() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o nome de usuário para efetuar o cadastro: ");
            String nomeLogin = scan.nextLine();

            System.out.println("Digite a senha do usuário: ");
            String password = scan.nextLine();

            Login login = new Login(nomeLogin, password);
            usuarios.add(login);

            System.out.println("Usuário cadastrado com sucesso!");
            autenticarUsuario(); 
        } catch (Exception erro) {
            System.out.println("Erro ao cadastrar usuário, tente novamente: " + erro.getMessage());
        }
    }

    // Método para autenticar usuário
    public void autenticarUsuario() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Nome de usuário:  ");
            String nomeLogin = scan.nextLine();

            System.out.println("Senha:");
            String password = scan.nextLine();

            boolean usuarioEncontrado = false; 
            for (Login usuario : usuarios) {
                if (usuario.getNomeLogin().equalsIgnoreCase(nomeLogin) && usuario.getPassword().equalsIgnoreCase(password)) {
                    System.out.println("Login bem-sucedido!");
                    MenuGerenciadorProdutos menu = new MenuGerenciadorProdutos();
                    menu.exibirMenu();
                    usuarioEncontrado = true; 
                    break; 
                }
            }

            if (!usuarioEncontrado) { 
                System.out.println("Usuário ou senha incorretos.");
                cadastrarLoginUsuario(); 
            }
        } catch (Exception erro) {
            System.out.println("Erro ao autenticar usuário: " + erro.getMessage());
        }
    }
}
