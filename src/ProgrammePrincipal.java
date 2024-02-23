import java.util.List;
import java.time.LocalDate;

public class ProgrammePrincipal {
    public static void main(String[] args) {

        // Création de la boutique qui aura comme nom "store"
       Boutique store = new Boutique();


       // Création de données produit ajouté dans la boutique
      /*  store.addProduit(new Produit("Asus Rog zephyris","Ordinateur"));
        store.addProduit(new Produit("Fanta fruit du dragon","Boisson"));
        store.addProduit(new Produit("Melon","Fruit")); */


        // Afficher la liste de produit
        List<Produit> produits  = store.getProduits();


        // afficher le stock
       // store.afficherStock();


        // Création des données produits avec leurs caractéristiques ajouté dans la boutique
        ProduitElectronique produitElectronique = new ProduitElectronique("Asus Rog zephyris", "Ordinateur", 1699 , 24);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("Melon", "Fruit", 2,LocalDate.now().plusMonths(2));
        ProduitBoisson produitBoisson = new ProduitBoisson("Fanta fruit du dragon", "Boisson", 1,50);


        // Ajouter des produits avec leur caractéristique
        store.addProduit(produitElectronique);
        store.addProduit(produitAlimentaire);
        store.addProduit(produitBoisson);

        // Afficher les produits
        store.afficherStock();



        // Création du panier + calcule des prix des produits dans le panier
        Panier panier = new Panier();
        panier.addPanier(produitElectronique);
        panier.addPanier(produitAlimentaire);
        panier.addPanier(produitBoisson);

        panier.prixTotalPanier();

        System.out.println("prix total panier " + panier.prixTotalPanier() + " €");




    }

}

