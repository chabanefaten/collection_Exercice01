package src;

class Titulaire {
    String nom;
    Compte[] MesComptes;
    int nbComptes;

    Titulaire(String n) {
        nom = n;
        MesComptes = new Compte[10];
        nbComptes = 0;
    }

    // Ajout d'un compte au titulaire
    void ajouterCompte(Compte compte) {
        MesComptes[nbComptes++] = compte;
    }

    // Affichage des comptes du titulaire
    void afficherComptes() {
        System.out.println("Comptes de " + nom + ":");
        for (int i = 0; i < nbComptes; i++) {
            System.out.println("Numéro: " + MesComptes[i].numero + ", Solde: " + MesComptes[i].solde);
        }
    }

    // Dépôt sur un compte du titulaire
    void depot(int numeroCompte, double montant) {
        for (int i = 0; i < nbComptes; i++) {
            if (MesComptes[i].numero == numeroCompte) {
                MesComptes[i].depot(montant);
                break;
            }
        }
    }

    // Retrait sur un compte du titulaire
    void retrait(int numeroCompte, double montant) {
        for (int i = 0; i < nbComptes; i++) {
            if (MesComptes[i].numero == numeroCompte) {
                MesComptes[i].retrait(montant);
                break;
            }
        }
    }
}