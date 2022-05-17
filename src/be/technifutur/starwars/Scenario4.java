package be.technifutur.starwars;

public class Scenario4 {
    public static void main(String[] args) {
        Personnage[] tab = new Personnage[]{
                new Jedi("Obiwan"),
                new Jedi("Luc"),
                new Sith("DarkVador"),
                new Sith("Darkmool"),
                new Clone(),
                new Soldat("Nick")
        };
        Force f;

        for(Personnage p : tab){
            System.out.println();
            System.out.println(p.getNom());
            p.afficheCamp();
            if (p instanceof Force){
                f = (Force)p;
                f.utiliserForce();
            }
            p.combattre();
        }
    }
}
