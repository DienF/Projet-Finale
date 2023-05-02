import java.util.ArrayList;

public class VueMenu {
    private DessinMenu dessin;

    public VueMenu(DessinMenu menu) {
        this.dessin = menu;
    }

    
    /** 
     * @param commande
     */
    public void dessine(ArrayList<Plat> commande) {
        dessin.dessine(commande);
    }
    
}