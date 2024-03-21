package src;

import java.util.Comparator;

public class SoldeComparator4 implements Comparator<Compte>{

	  public int compare(Compte c1, Compte c2) {
	        return Double.compare(c1.solde, c2.solde);
	    }
}
