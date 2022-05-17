package be.technifutur.starwars;

public class Vaisseau {
    public String nom;
    public int nbMissille;

    public void tirer() {
        if (this.nbMissille > 0) {
            // int nbMissille ==> variable locale
            System.out.println("PAN");
            this.nbMissille--; // Avec le "this" ont appel d'office la variable d'instance, sans "this" il fait référence à la variable locale si présente, le "this" n'est pas à inscrire obligatoirement, mais dans ce cas la il vérifie si il y a une variable locale
        } else {
            System.out.println("POUF");
        }
    }
}
