package be.technifutur.starwars;

public abstract class Empire extends Personnage {

    public Empire(String nom) {
        super(nom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je fais partie de l'empire");
    }

}
