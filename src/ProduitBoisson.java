import java.time.LocalDate;

public class ProduitBoisson extends Produit {

    // Attribut pour la quantité
    private int quantite;

    // Création du constructeur ProduitBoisson
    public ProduitBoisson(String nom, String description, int prix, int quantite) {
        super(nom,description, prix);
        this.quantite = quantite;
    }

    // Récuperation de la valeur
    public int getQuantite(){
        return quantite;
    }

    // Attribuer la valeur
    public void setQuantite(int quantite){
        this.quantite= quantite;
    }

    // Afficher valeur
    public void afficher(){

        super.afficher();
        System.out.println("quantité = " + quantite + " centilitres");
        System.out.println("\n");

    }


}
