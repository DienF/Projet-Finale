import java.util.ArrayList;

public class TicketClient implements DessinMenu{

    @Override
    public void dessine(ArrayList<Plat> commande) {
        System.out.println("Ticket Client");
        System.out.println("Contenu de la commande :");
        System.out.println("Nom Produit \t Quantité \t Prix Unité \t Prix");
        for (Plat produit : commande) {
            System.out.println(produit.getNom() + " |\t" + produit.getQte() + " |\t" + produit.getPrix() + "cfp |\t" + produit.getPrix()*produit.getQte() + "cfp");
        }
    }
}