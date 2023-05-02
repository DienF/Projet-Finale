import java.util.ArrayList;

public class Commande {
    private EtatCommande etatCommande;
    ArrayList<Plat> commande = new ArrayList<Plat>();

    /**
     * constructeur qui initailise l'état de la commande à "CommandeEnCours"
     */
    public Commande() {
        this.etatCommande = new CommandeEnCours();
    }
    /**
     * méthode qui ajoute un plat dans une ArrayList commande
     * @param produit : Plat
     */
    public void ajoutePlat(Plat produit) {
        this.etatCommande.ajoutePlat(commande,produit);
    }

    /**
     * méthode qui supprime un plat de l'ArrayList commande
     * @param produit Plat
     */
    public void retirePlat(Plat produit) {
        this.etatCommande.retirePlat(commande, produit);
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
     * méthode qui affiche les deux types de ticket via le pattern Strategy
     */
    public void affiche() {
        VueMenu vueClient = new VueMenu(new TicketClient());
        vueClient.dessine(commande);
        VueMenu vueLivreur = new VueMenu(new TicketLivreur());
        vueLivreur.dessine(commande);
    }
}
