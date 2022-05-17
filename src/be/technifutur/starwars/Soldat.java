package be.technifutur.starwars;

public class Soldat extends Rebelle{
    public Soldat(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("Je combat pour les rebelles");
    }
}
