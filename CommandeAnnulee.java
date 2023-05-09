import java.util.ArrayList;

public class CommandeAnnulee extends EtatCommande {
    /** 
     * @param commande
     * @param plat
     */
    @Override
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {
        System.out.println("Commande annulée impossible d'ajouter un plat");
    }

    @Override
    public void retirePlat(ArrayList<Plat> commande, Plat plat){
        System.out.println("Commande annulée impossible de retirer un plat");
    }

    @Override
    public void annule(ArrayList<Plat> commande) {
        System.out.println("Commande déjà annulé");
    }
}
