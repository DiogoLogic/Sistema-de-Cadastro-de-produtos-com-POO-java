package view;


import controller.GerenciamentoLogin;


public class Principal extends GerenciamentoLogin{

public static void main(String[] args) {
		
	try {

		System.out.println("==SISTEMA DE CADASTRO DE PRODUTOS==");
		System.out.println("");
		System.out.println("==INVENTORY WAREHOUTE==");
		System.out.println("");
	
		System.out.println("Faça o login para ter acesso ao sistema!");
		
		GerenciamentoLogin gerenciadorLogin = new GerenciamentoLogin(); 
        gerenciadorLogin.autenticarUsuario(); 
		
	
	
	} catch (Exception erro) {
		System.out.println("Erro ao fazer login, usuario não encontrado");
	}
	}

}