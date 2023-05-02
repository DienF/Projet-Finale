import java.util.Scanner;

public class Client {

   static String[][] menu = {{"1","BigMac","950"},{"2","Cheeseburger","850"},{"3","VeganBurger","800"},
                           {"4","Coca-Cola","350"},{"5","Sprite","350"},{"6","Eau","150"},
                           {"7","Petite Frite","500"},{"8","Grande Frite","750"}};


   /**
    * méthode main qui crée le(s) commande(s)
    * @param args
    */
 public static void main(String[] args) {
   Scanner choixMenu = new Scanner(System.in);
   for (int i = 0; i < menu.length; i++) {
      for (int j = 0; j < menu[i].length; j++) {
         System.out.print(menu[i][j] + "   ");
      }
      System.out.println();
   }
   Commande commande = new Commande();
   while (true){
      System.out.println("Faites votre choix :");
      int choix = choixMenu.nextInt();
      System.out.println("Combien ? : ");
      int qte = choixMenu.nextInt();
      commande.ajoutePlat(new Plat(menu[choix-1][1], qte, menu[choix-1][2].hashCode()));

      //TODO Afficher ticket Client
      //TODO Valider commande ?
      //TODO Annuler commande ?
      //TODO Renseigner Addresse et Nom Client
      //TODO Afficher les tickets si il le faut

      System.out.println("Autre chose ? (o/n) : ");
      String continueCommande = choixMenu.next();
      if (continueCommande.equals("n")) {
         break;
      }
   }
   /* Commande commande = new Commande();
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
   commande2.affiche();*/
   
 }
}
