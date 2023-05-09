import java.util.ArrayList;

public class CommandeLivree extends EtatCommande {    
    /** 
     * @param commande
     */
    @Override
    public void annule(ArrayList<Plat> commande) {
        System.out.println("Commande livrée impossible de l'annulée");
    }
}