package be.technifutur.starwars;

public abstract class Personnage {
   private final String nom;

    public Personnage(String nom) {
        this.nom = nom;
    }

    public String getNom() {
       return nom;
    }

    public abstract void afficheCamp();
    public abstract void combattre();

}
