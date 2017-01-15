package gestionBD;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte cpt = new Compte(1000, 4000);
		Compte.ajouterCompte(cpt);
		System.out.println("Le nmero du dernier element est "+ Compte.getLastNumber());
	}

}
