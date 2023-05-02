public class CommandeEnCours extends EtatCommande{
    
    /** 
     * @return EtatCommande
     */
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeValidee();
    }
}
