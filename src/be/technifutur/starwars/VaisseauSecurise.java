package be.technifutur.starwars;

public class VaisseauSecurise {
    private String nom = "Vaisseau sans nom"; // le faite de le mettre en private ont ne peux pas y y acceder en dehors de la class, celui-ci à un nom par défaut assigné "Vaisseau sans nom"
    private int nbMissille;

    private boolean enVol = false;

    public VaisseauSecurise(String anom) { // les strinf sont des objet et peuvent donc avoir des métodes "trim et length" par exemple
        if (anom != null && anom.trim().length() > 0) // trim permet de supprimer les espaces, si on refusse que nom sois null il faut un nom par défaut
            this.nom = anom;
    }

    public static int nbEnVol; // Variables de class qui ne peux pas être modifier de l'extérieur "static".

    public static int getnbEnVol() {
        return nbEnVol;
    }

    public void tirer() {
        if (this.nbMissille > 0) {
            // int nbMissille ==> variable locale
            System.out.println("PAN");
            this.nbMissille--; // Avec le "this" ont appel d'office la variable d'instance, sans "this" il fait référence à la variable locale si présente, le "this" n'est pas à inscrire obligatoirement, mais dans ce cas la il vérifie si il y a une variable locale
        } else {
            System.out.println("POUF");
        }
    }

    public boolean addMissille(int nbMissille) {

        boolean added = false;

        if (nbMissille > 0) {
            this.nbMissille += nbMissille;
        }

        return added;
    }

    public int getNbMissille() {
        return nbMissille;
    }

    public boolean removeMissille(int nbMissille) {

        boolean remove = false;
        // reffuse de retirer les missiles
        if (nbMissille > 0 && nbMissille <= this.nbMissille) {
            this.nbMissille -= nbMissille;
            remove = true;
        }
        return remove;

    }

    public boolean decoller() {

        if (this.enVol) {
            System.out.println("l'appareil " + this.nom + " est déjà en vol");
            enVol = false;
        } else {
            System.out.println("l'appareil " + this.nom + " décolle");
            enVol = true;
            nbEnVol++;
        }

        return enVol;
    }

    public boolean atterrir() {

        if (this.enVol) {
            System.out.println("l'appareil " + this.nom + " est déjà au sol ");
            enVol = false;
        } else {
            System.out.printf("l'appareil %s attérit%n", this.nom); //Autre manière de faire une concaténation
            enVol = true;
            nbEnVol--;

        }

        return enVol;
    }
}
