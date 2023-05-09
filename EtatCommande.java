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
    public void retirePlat(ArrayList<Plat> commande, String nomPlat) {
        Plat res = null;
        for (Plat plat : commande) {
            if (plat.getNom().equals(nomPlat)) {
                System.out.println(plat.getQte() + " " + plat.getNom() + " retiré(e) du panier avec SUCCÈS");
                res = plat;
                break;
            }
        }
        commande.remove(res);
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
     * méthode qui permet de passer la commande à l'état suivant
     */
    public EtatCommande etatSuivant() {
        return null;
    };
}