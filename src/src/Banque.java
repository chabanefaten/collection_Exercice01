package src;

import java.util.Arrays;

class Banque {
    String nom;
    Compte[] Comptes;
    int nbComptes;

    Banque(String n) {
        Comptes = new Compte[50];
        nom = n;
        nbComptes = 0;
    }

    // Création d'un compte
    void creerCompte(Titulaire titulaire, int numeroCompte) {
        Compte nouveauCompte = new Compte(numeroCompte);
        Comptes[nbComptes++] = nouveauCompte;
        titulaire.ajouterCompte(nouveauCompte);
    }

    // Affichage des comptes
    void affiche() {
        System.out.println("Comptes de la banque " + nom + ":");
        for (int i = 0; i < nbComptes; i++) {
            System.out.println("Numéro: " + Comptes[i].numero + ", Solde: " + Comptes[i].solde);
        }
    }

    // Récupération du compte avec le solde le plus élevé
    int compteAvecSoldeMax() {
        double maxSolde = Double.MIN_VALUE;
        int numeroCompteMax = -1;
        for (int i = 0; i < nbComptes; i++) {
            if (Comptes[i].solde > maxSolde) {
                maxSolde = Comptes[i].solde;
                numeroCompteMax = Comptes[i].numero;
            }
        }
        return numeroCompteMax;
    }

    // Tri des comptes selon le solde
    void trierCompte() {
        Arrays.sort(Comptes, 0, nbComptes);
    }
}