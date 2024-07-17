package metier;
public class Compte {
    private long num;
    private String nomClient;
    private double solde;

    public Compte() {
        // Constructeur sans paramètres
    }

    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    // Getters et setters
    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro du compte : " + num);
        System.out.println("Nom du client : " + nomClient);
        System.out.println("Solde du compte : " + solde);
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Retrait impossible. Solde insuffisant.");
        }
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Dépôt impossible. Montant invalide.");
        }
    }
}

