import java.util.Scanner;

public class Client {
   static String[][] menu = {
      {"1", "BigMac      ", "950"},
      {"2", "Cheeseburger", "850"},
      {"3", "VeganBurger ", "800"},
      {"4", "Coca-Cola   ", "350"},
      {"5", "Sprite      ", "350"},
      {"6", "Eau         ", "150"},
      {"7", "Petite Frite", "500"},
      {"8", "Grande Frite", "750"}
   };

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
      while (true) {
         System.out.println("Ajouter ou supprimer un plat (a/s) : ");
         String action = choixMenu.next();
         if (action.equals("s")) {
            if (commande.commande.size() == 0) {
               System.out.println("Il n'y a rien à supprimer pour l'instant");
            } else {
               System.out.println("Numéro du produit à supprimer : ");
               int choix = choixMenu.nextInt();
               commande.retirePlat(menu[choix-1][1]);
            }
         } else {
            System.out.println("Faites votre choix :");
            int choix = choixMenu.nextInt();
            System.out.println("Combien ? : ");
            int qte = choixMenu.nextInt();
            commande.ajoutePlat(new Plat(menu[choix-1][1], qte, Integer.parseInt(menu[choix-1][2])));
         }
         System.out.println("Modifier(m), valider(v) ou annuler (x) la commande : ");
         String continueCommande = choixMenu.next();
         if (continueCommande.equals("v")) {
            System.out.println("Renseignez votre nom SVP : ");
            String nom = choixMenu.next();
            System.out.println("Renseignez votre adresse SVP : ");
            String addr = choixMenu.next();
            commande.setNomAddr(nom, addr);
            commande.affiche();
            System.out.println("Commande livrée");
            commande.etatSuivant();
         } else if (continueCommande.equals("x")) {
            commande.annule();
         }
      }
   }
}
