public class PlatSP {
    private String nom;
    private int qte;
    private int prix;

    /**
     * Constructeur de la class Plat qui intialise le nom, la quantité et le prix
     * @param nom String nom du plat
     * @param qte Entier quantité de plat
     * @param prix Entier prix unitaire du plat
     */
    public PlatSP(String nom, int qte, int prix) {
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
    }

    /**
     * Getter pour avoir le nom du plat
     * @return String nom du plat
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Getter pour avoir la quantité de plat
     * @return Entier quantité de plat
     */
    public int getQte() {
        return this.qte;
    }

    /**
     * Getter pour avoir le prix du plat
     * @return Entier prix du plat
     */
    public int getPrix() {
        return this.prix;
    }
}