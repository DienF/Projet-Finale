import java.util.ArrayList;

public class CommandeValidee extends EtatCommande {
    /** 
     * @return EtatCommande
     */
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeLivree();
    }

    @Override
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {
        System.out.println("Commande validée impossible de rajouter un plat");
    }

    @Override
    public void retirePlat(ArrayList<Plat> commande, Plat plat){
        System.out.println("Commande validée impossible de supprimer un plat");
    }
}