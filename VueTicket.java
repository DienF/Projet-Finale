import java.util.ArrayList;

public class VueTicket {
    private DessinTicket dessin;

    public VueTicket(DessinTicket menu) {
        this.dessin = menu;
    }
    
    /** 
     * @param commande
     */
    public void dessine(ArrayList<Plat> commande) {
        dessin.dessine(commande);
    }
}