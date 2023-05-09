import java.util.ArrayList;

public class CommandeAnnulee extends EtatCommande {
    
    /**
     * méthode qui affiche un message car impossible d'ajouter un plat dans une commande annulée
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {
        System.out.println("Commande annulée impossible d'ajouter un plat");
    }

    /**
     * méthode qui affiche un message car impossible de retirer un plat dans une commande annulée
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    @Override
    public void retirePlat(ArrayList<Plat> commande, Plat plat){
        System.out.println("Commande annulée impossible de retirer un plat");
    }

    /**
     * méthode qui affiche un message car impossible d'annulé' une commande annulée
     */
    @Override
    public void annule(ArrayList<Plat> commande) {
        System.out.println("Commande déjà annulé");
    }
}
