import java.util.ArrayList;

public class TicketLivreur implements DessinMenu {

    @Override
    public void dessine(ArrayList<Plat> commande) {
        System.out.println("Ticket Livreur");
        System.out.println("Nom et Adresse de Livraison : "); //TODO ajouter nom et adresse du client
        System.out.println("Contenu de la commande :");
        System.out.println("Nom Produit \t Quantité");
        int total = 0;
        for (Plat produit : commande) {
            System.out.println(produit.getNom() + "\t" + produit.getQte());
            total += produit.getPrix()*produit.getQte();
        }
        System.out.println("Total : " + total + "cfp");
    }
}