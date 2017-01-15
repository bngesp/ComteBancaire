package gestionBD;

public class Profil {
	private String idprofil;
	private String libelle;
	
	public Profil(String idprofil, String libelle) {
		super();
		this.idprofil = idprofil;
		this.libelle = libelle;
	}
	public String getIdprofil() {
		return idprofil;
	}
	public void setIdprofil(String idprofil) {
		this.idprofil = idprofil;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
