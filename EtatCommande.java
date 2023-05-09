import java.util.ArrayList;

abstract class EtatCommande {
    /**
     * méthode qui ajoute un plat dans une ArrayList
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    public void ajoutePlat(ArrayList<Plat> commande, Plat plat) {
        commande.add(plat);
        System.out.println(plat.getQte() + " " + plat.getNom() + " ajouté(e) au panier avec SUCCÈS");
    };

    /**
     * méthode qui supprime un plat dans une ArrayList
     * @param commande ArrayList<Plat> 
     * @param plat Plat
     */
    public void retirePlat(ArrayList<Plat> commande, Plat plat) {
        commande.remove(plat);
        System.out.println(plat.getQte() + " " + plat.getNom() + " retiré(e) du panier avec SUCCÈS");
    };

    /**
     * méthode qui supprime tout les plats dans une ArrayList
     * @param commande ArrayList<Plat>
     */
    public void annule(ArrayList<Plat> commande) {
        commande.clear();
        System.out.println("Commande annulée avec SUCCÈS");
    };

    /**
     * méthode qui fait rien ICI
     */
    public EtatCommande etatSuivant() {
        return null;
    };
}