package gestionBD;

public class Client extends Personne {
	private int codeSecret;
    private Compte compte;
	public Client(String nom, String prenom, String adresse, long cNI,
			long telephone, int codeSecret) {
		super(nom, prenom, adresse, cNI, telephone);
		this.codeSecret = codeSecret;
	}

	public int getCodeSecret() {
		return codeSecret;
	}

	public void setCodeSecret(int codeSecret) {
		this.codeSecret = codeSecret;
	}
	
 public static void AjouterClient(Client cl){
	 
 }

}
