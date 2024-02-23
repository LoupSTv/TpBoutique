import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Boutique {

        // Création de "produit" dans la boutique
    private List<Produit> produits = new ArrayList<>();


    // Ajouter des produits dans la boutique
    public void addProduit(Produit produit) {
        produits.add(produit);
    }


    // Liste de produit dans la boutique
        public List<Produit> getProduits(){
            return produits;
        }


        // Boucle permettant d'afficher le stock
    public void afficherStock(){
        for(Produit prod : produits) {
            prod.afficher();

        }
    }


    }

