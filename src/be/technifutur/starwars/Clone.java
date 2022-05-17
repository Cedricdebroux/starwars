package be.technifutur.starwars;

public class Clone extends Empire{
    public Clone() {
        super("clone");
    }

    @Override
    public void combattre() {
        System.out.println("je combat pour l'empire, comme tous mes semblables");
    }
}
