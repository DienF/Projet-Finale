import java.util.ArrayList;

public class VueTicket {
    private DessinTicket dessin;

    public VueTicket(DessinTicket menu) {
        this.dessin = menu;
    }
    
    /** 
     * méthode permettant d'afficher l'ArrayList "commande"
     * @param commande ArrayList<Plat>
     */
    public void dessine(ArrayList<Plat> commande) {
        dessin.dessine(commande);
    }
}