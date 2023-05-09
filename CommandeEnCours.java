public class CommandeEnCours extends EtatCommande {

    /**
     * méthode qui renvoie l'état "CommandeValidee"
     */
    @Override
    public EtatCommande etatSuivant() {
        return new CommandeValidee();
    }
}