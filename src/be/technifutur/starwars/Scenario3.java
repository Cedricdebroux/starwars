package be.technifutur.starwars;

public class Scenario3 {
    public static void main(String[] args) {
        VaisseauAncetre va = new VaisseauAncetre("Wing");
        VaisseauEmpire ve = new VaisseauEmpire("Xwing");
        VaisseauRebelle vr = new VaisseauRebelle("Millenium");

        ve.decoller();
        System.out.println(VaisseauAncetre.getnbEnVol());
        ve.atterrir();
        VaisseauAncetre va2 = ve;

    }
}
