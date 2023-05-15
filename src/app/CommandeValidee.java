package app;
import java.util.ArrayList;

public class CommandeValidee extends EtatCommande {

    /**
     * méthode qui renvoie l'état "CommandeLivree"
     */
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeLivree();
    }

    /**
     * méthode qui affiche un message car impossible d'ajouter un plat dans une commande validée
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {
        System.out.println("Commande validée impossible de rajouter un plat");
    }

    /**
     * méthode qui affiche un message car impossible de retirer un plat dans une commande validée
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void retirePlat(ArrayList<Plat> commande, String nomPlat){
        System.out.println("Commande validée impossible de supprimer un plat");
    }
}