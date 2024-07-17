package presentation;
import metier.Compte;
public class GestionComptesApp {
    public static void main(String[] args) {
        // Création du compte c1
        Compte c1 = new Compte(11111, "Ahmed", 20000);

        // Création du compte c2
        Compte c2 = new Compte(22222, "HAJAR", 30000);

        // Retrait d'un montant de 19000 du premier compte
        c1.retirer(19000);
        c1.afficherCompteInfo();

        // Retrait d'un montant de 45000 du deuxième compte
        c2.retirer(45000);
        c2.afficherCompteInfo();

        // Dépôt d'un montant de 15000 dans le premier compte
        c1.deposer(15000);
        c1.afficherCompteInfo();
    }
}
