package src;

public class Compte implements Comparable<Compte>{
	 int numero;
	    double solde;

	    Compte(int numero) {
	        this.numero = numero;
	        solde = 0.0;
	    }

	    void retrait(double montant) {
	        solde -= montant;
	    }

	    void depot(double montant) {
	        solde += montant;
	    }

	    @Override
	    public int compareTo(Compte autreCompte) {
	        return Double.compare(this.solde, autreCompte.solde);
	    }
	}