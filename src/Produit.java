public class Produit {



     // Création attribut "nom"
    private String nom;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) { this.nom = nom;}


    // Création attribut "description"
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    // Création attribut "prix"
    private int prix;
    public int getPrix() {
        return prix;
    }


    // Création d'information "Produit"
    public Produit (String nom, String description , int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }


    // Afficher nom des produits + descriptions + prix
    public void afficher(){
        System.out.println("nom " +nom);
        System.out.println("description " +description);
        System.out.println("prix " + prix + " €");

    }

}

