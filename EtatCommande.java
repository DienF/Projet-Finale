import java.util.ArrayList;

abstract class EtatCommande {
    /**
     * méthode qui ajoute un plat dans une ArrayList
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    public void ajoutePlat(ArrayList<Plat> commande,Plat plat){
        commande.add(plat);
    };

    /**
     * méthode qui supprime un plat dans une ArrayList
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    public void retirePlat(ArrayList<Plat> commande,Plat plat){
        commande.remove(plat);
    };

    /**
     * méthode qui supprime tout les plats dans une ArrayList
     * @param commande ArrayList<Plat>
     */
    public void annule(ArrayList<Plat> commande){
        commande.clear();
    };

    /**
     * méthode qui fait rien ICI
     */
    public EtatCommande etatSuivant(){
        return null;
    };
}
