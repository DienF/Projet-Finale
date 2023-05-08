import java.util.ArrayList;

public class CommandeSP {
    private String etatCommande;
    ArrayList<PlatSP> commande = new ArrayList<PlatSP>();
    private String nom;
    private String addr;

    /**
     * constructeur qui initailise l'état de la commande à "CommandeEnCours"
     */
    public CommandeSP() {
        this.etatCommande = "CommandeEnCours";
    }
    /**
     * méthode qui ajoute un plat dans une ArrayList commande
     * @param plat : Plat
     */
    public void ajoutePlat(PlatSP plat) {
        if (!etatCommande.equals("CommandeAnnulee") && !etatCommande.equals("CommandeValidee")){
            this.commande.add(plat);
            System.out.println(plat.getQte() + " " + plat.getNom() + " ajouté(e) au panier avec SUCCÈS");
        }
        
    }

    /**
     * méthode qui supprime un plat de l'ArrayList commande
     * @param plat Plat
     */
    public void retirePlat(PlatSP plat) {
        if (!etatCommande.equals("CommandeAnnulee") && !etatCommande.equals("CommandeValidee")){
            this.commande.remove(plat);
            System.out.println(plat.getQte() + " " + plat.getNom() + " retiré(e) du panier avec SUCCÈS");
        }
    }

    /**
     * méthode qui efface l'ensemble de la commande et passe
     * l'état de la commande à "CommandeAnnulé"
     */
    public void annule() {
        if (!etatCommande.equals("CommandeAnnulee") && !etatCommande.equals("CommandeLivree")){
            this.commande.clear();
            this.etatCommande = "CommandeAnnulee";
            System.out.println("Commande annulée avec SUCCÈS");
        }
    }

    /**
     * méthode qui passe la commande à l'étatSuivant
     * CommandeEnCours --> CommandeValidee --> CommandeLivree
     */
    public void etatSuivant() {
        if (this.etatCommande.equals("CommandeEnCours")) this.etatCommande = "CommandeValidee";
        else if (this.etatCommande.equals("CommandeValidee")) this.etatCommande = "CommandeLivree";
    }

    public void setNomAddr(String nom, String addr) {
        this.nom = nom;
        this.addr = addr;
    }

    /**
     * méthode qui affiche les deux types de ticket via le pattern Strategy
     */
    public void affiche() {
        System.out.println("\nTicket Client");
        System.out.println("Contenu de la commande :");
        System.out.println("Plat\t\t| Quantité\t| Prix Unité\t| Prix");
        for (PlatSP plat : commande) {
            System.out.println(
                plat.getNom() + "\t|\t" +
                plat.getQte() + "\t|\t" +
                plat.getPrix() + " CFP\t|\t" +
                plat.getPrix() * plat.getQte() + " CFP"
            );
        }

        System.out.println("\nTicket Livreur");
        System.out.println("Nom du client : " + nom);
        System.out.println("Adresse de livraison : : " + addr);
        System.out.println("Contenu de la commande :");
        System.out.println("Plat \t\t| Quantité");
        int total = 0;
        for (PlatSP plat : commande) {
            System.out.println(
                plat.getNom() + "\t|\t" +
                plat.getQte()
            );
            total += plat.getPrix() * plat.getQte();
        }
        System.out.println("Total : " + total + " CFP");
    }
}
