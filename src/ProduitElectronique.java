public class ProduitElectronique extends Produit {

    // Attribut pour la date de garantie
    private int dureeGarantie;

    // Création du constructeur ProduitElectronique
    public ProduitElectronique(String nom, String description, int prix, int dureeGarantie) {
        super(nom, description, prix);
        this.dureeGarantie = dureeGarantie;
    }

    // Récuperation de la valeur
    public int getDureeGarantie(){
        return dureeGarantie;
    }

    // Attribuer la valeur
    public void setDureeGarantie(int dureeGarantie){
        this.dureeGarantie = dureeGarantie;
    }


    // Afficher valeur
    public void afficher(){

        super.afficher();
        System.out.println("garantie = " + dureeGarantie + " mois");
        System.out.println("\n");

    }

}
