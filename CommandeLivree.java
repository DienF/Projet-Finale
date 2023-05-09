import java.util.ArrayList;

public class CommandeLivree extends EtatCommande {    

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