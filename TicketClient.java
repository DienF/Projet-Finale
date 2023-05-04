import java.util.ArrayList;

public class TicketClient implements DessinTicket {
    @Override
    public void dessine(ArrayList<Plat> commande) {
        System.out.println("\nTicket Client");
        System.out.println("Contenu de la commande :");
        System.out.println("Plat\t\t| Quantité\t| Prix Unité\t| Prix");
        for (Plat plat : commande) {
            System.out.println(
                plat.getNom() + "\t|\t" +
                plat.getQte() + "\t|\t" +
                plat.getPrix() + " CFP\t|\t" +
                plat.getPrix() * plat.getQte() + " CFP"
            );
        }
    }
}