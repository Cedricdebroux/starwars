package be.technifutur.starwars;

public abstract class Rebelle extends Personnage {

    public Rebelle(String nom) {
        super(nom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je fais partie des rebelles");
    }
}
