package app;
import java.util.ArrayList;

public class CommandeLivree extends EtatCommande {    

    /**
     * méthode qui affiche un message car impossible d'ajouter un plat dans une commande livrée
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {
        System.out.println("Commande livrée impossible d'ajouter un plat");
    }

    /**
     * méthode qui affiche un message car impossible de retirer un plat dans une commande livrée
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void retirePlat(ArrayList<Plat> commande, String nomPlat){
        System.out.println("Commande livrée impossible de retirer un plat");
    }

    /**
     * méthode qui affiche un message car impossible d'annulée une commande livrée'
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void annule(ArrayList<Plat> commande) {
        System.out.println("Commande livrée impossible de l'annulée");
    }
}