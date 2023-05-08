import java.util.ArrayList;

public class CommandeAnnulee extends EtatCommande {
    /** 
     * @param commande
     * @param plat
     */
    @Override
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {}

    @Override
    public void retirePlat(ArrayList<Plat> commande, Plat plat){}

    @Override
    public void annule(ArrayList<Plat> commande) {}
}
