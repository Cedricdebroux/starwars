package be.technifutur.starwars;

public class Sith extends Empire implements Force{
    public Sith(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("J'utilise mon sabre laser et les techniques de combat Sith");
    }

    @Override
    public void utiliserForce() {
        System.out.println("J'utilise le côté obscure de la force");
    }
}
