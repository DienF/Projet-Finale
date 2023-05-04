import java.util.ArrayList;

public class TicketLivreur implements DessinTicket {
    private String nom;
    private String addr;

    public TicketLivreur (String nom, String addr){
        this.nom = nom;
        this.addr = addr;
    }

    @Override
    public void dessine(ArrayList<Plat> commande) {
        System.out.println("\nTicket Livreur");
        System.out.println("Nom du client : " + nom);
        System.out.println("Adresse de livraison : : " + addr);
        System.out.println("Contenu de la commande :");
        System.out.println("Plat \t\t| Quantité");
        int total = 0;
        for (Plat plat : commande) {
            System.out.println(
                plat.getNom() + "\t|\t" +
                plat.getQte()
            );
            total += plat.getPrix() * plat.getQte();
        }
        System.out.println("Total : " + total + " CFP");
    }
}