import java.util.List;
import java.util.ArrayList;


public class Panier {

    // Création liste dans le panier pour affecter les produits dans à l'interrieur
    private List<Produit> produits ;

    public Panier() {
        this.produits = new ArrayList<>();
    }

    // Ajout des produits dans le panier
    public void ajouterPanier(Produit produit) {
        produits.add(produit);
    }

    // Création du prix total
    public int prixTotalPanier(){
        int total = 0;
        for (Produit produit: produits){
            total += produit.getPrix();
        }

        return total;
    }
}
