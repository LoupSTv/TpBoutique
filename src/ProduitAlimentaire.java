import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {

    // Attribut pour la date d'expiration
    private LocalDate dateExpiration;

    // Création du constructeur ProduitAlimentaire
    public ProduitAlimentaire(String nom, String description, int prix, LocalDate dateExpiration) {
        super(nom, description,  prix);
        this.dateExpiration = dateExpiration;
    }

    // Récuperation de la valeur
    public LocalDate getdateExpiration(){
        return dateExpiration;
    }


    // Attribuer la valeur
    public void setDateExpiration(LocalDate dateExpiration){
        this.dateExpiration= dateExpiration;
    }


    // Afficher valeur
    public void afficher(){

        super.afficher();
        System.out.println("expiration = " + dateExpiration );
        System.out.println("\n");

    }

}
