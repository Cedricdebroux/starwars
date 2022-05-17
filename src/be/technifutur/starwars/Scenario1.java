package be.technifutur.starwars;

public class Scenario1 {

    public static void main(String[] args) {
        System.out.println("scénario 1");
        System.out.println("Il ya très très longtemps ...");
        Vaisseau v1 = null;
        Vaisseau v2 = new Vaisseau();
        Vaisseau v3 = v2;


        v1 = new Vaisseau();
        System.out.println(v1.nom);
        System.out.println(v1.nbMissille);

        /* Les variables locales ne sont pas initialisé par défault */

        v1.nom = "Millenium";
        v2.nom = "Xwing";
        v3.nom = "wing";

        System.out.println(v1.nom);
        System.out.println(v2.nom);
        System.out.println(v3.nom);
        System.out.println("----------------------------");
        v1.nbMissille = 2;
        v1.tirer();
        v2.tirer();

    }

}
