public class CommandeValidee extends EtatCommande {

    
    /** 
     * @return EtatCommande
     */
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeLivree();
    }
}
