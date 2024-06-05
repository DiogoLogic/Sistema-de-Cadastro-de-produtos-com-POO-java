package model;

public class Login {
	private String nomeLogin;
	private String password;
	
	public Login() {
		
	}
	
	public Login(String nomeLogin, String password) {
		this.nomeLogin = nomeLogin;
		this.password = password;
		
	}

	public String getNomeLogin() {
		return nomeLogin;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [nomeLogin=" + nomeLogin + ", password=" + password + "]";
	}
	
}
