package be.technifutur.starwars;

public class Jedi extends Rebelle implements Force{
    public Jedi(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("Mon sabre est mon amis");
    }

    @Override
    public void utiliserForce() {
        System.out.println("La force est avec moi !!!");
    }
}
