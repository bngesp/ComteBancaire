package gestionBD;

public class Gerant extends Personne {
	private String login;
	private String password;
	private Profil profil;
public Gerant(String nom, String prenom, String adresse, long cNI,
			long telephone, String login, String password) {
		super(nom, prenom, adresse, cNI, telephone);
		this.login = login;
		this.password = password;
	}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
