import java.util.ArrayList;

public class Commande {
    private EtatCommande etatCommande;
    ArrayList<Plat> commande = new ArrayList<Plat>();
    private String nom;
    private String addr;

    /**
     * constructeur qui initailise l'état de la commande à "CommandeEnCours"
     */
    public Commande() {
        this.etatCommande = new CommandeEnCours();
    }
    /**
     * méthode qui ajoute un plat dans une ArrayList commande
     * @param plat : Plat
     */
    public void ajoutePlat(Plat plat) {
        this.etatCommande.ajoutePlat(commande, plat);
    }

    /**
     * méthode qui supprime un plat de l'ArrayList commande
     * @param plat Plat
     */
    public void retirePlat(Plat plat) {
        this.etatCommande.retirePlat(commande, plat);
    }

    /**
     * méthode qui efface l'ensemble de la commande et passe
     * l'état de la commande à "CommandeAnnulé"
     */
    public void annule() {
        this.etatCommande.annule(commande);
        this.etatCommande = new CommandeAnnulee();
    }

    /**
     * méthode qui passe la commande à l'étatSuivant
     * CommandeEnCours --> CommandeValidee --> CommandeLivree
     */
    public void etatSuivant() {
        this.etatCommande = etatCommande.etatSuivant();
    }

    /**
     * Setter permettant de définir le nom et l'adress
     * @param nom String nom du client
     * @param addr String adresse du client
     */
    public void setNomAddr(String nom, String addr) {
        this.nom = nom;
        this.addr = addr;
    }

    /**
     * méthode qui affiche les deux types de ticket via le pattern Strategy
     */
    public void affiche() {
        VueTicket vueClient = new VueTicket(new TicketClient());
        vueClient.dessine(commande);
        VueTicket vueLivreur = new VueTicket(new TicketLivreur(nom, addr));
        vueLivreur.dessine(commande);
    }
}
