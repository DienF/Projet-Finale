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
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {}

    @Override
    public void retirePlat(ArrayList<Plat> commande, Plat plat){}
}