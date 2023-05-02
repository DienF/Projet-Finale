public class Client
{
   /**
    * méthode main qui crée le(s) commande(s)
    * @param args
    */
 public static void main(String[] args)
 {
    Commande commande = new Commande();
    commande.ajoutePlat(new Plat("BicMac",1,950));
    commande.ajoutePlat(new Plat("Coca-cola", 2, 350));
    commande.affiche();
    commande.etatSuivant();
    commande.ajoutePlat(new Plat("Petite Frite",8,500));
    commande.annule();
    commande.affiche();
    Commande commande2 = new Commande();
    commande2.ajoutePlat(new Plat("Cheeseburger",2,850));
    commande2.ajoutePlat(new Plat("Sprite",2,350));
    commande2.affiche();
    commande2.etatSuivant();
    commande2.affiche();
    commande2.etatSuivant();
    commande2.annule();
    commande2.affiche();
 }
}
