package gestionBD;

import gestionBD.BD.Connexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Compte {
	private int numero;
	private double solde;
	private double decouvert;
	private static Connection connect;
	public Compte(int numero, double solde, double decouvert) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	public Compte( double solde, double decouvert) {

		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	public static void ajouterCompte(Compte cmp){
		try{
			connect=Connexion.getConnection();
			String req = "insert into compte(solde, decouvert) values(?,?)";
			PreparedStatement sta=connect.prepareStatement(req);
			sta.setDouble(1,cmp.getSolde());
			sta.setDouble(2,cmp.getDecouvert());
			sta.execute();
			connect.close();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static int getLastNumber(){
		connect=Connexion.getConnection();
		String req = "select count(*) from compte";
		Statement s;
		int val=0;
		try {
			s = connect.createStatement();
			ResultSet resultat = s.executeQuery(req);
			resultat.next();
			val = resultat.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return val;
		
	}
}
