package be.technifutur.starwars;

public class Scenario3 {
    public static void main(String[] args) {
        //VaisseauAncetre va = new VaisseauAncetre("Wing"); pas de new sur une class abstract
        VaisseauEmpire ve = new VaisseauEmpire("Xwing");
        VaisseauRebelle vr = new VaisseauRebelle("Millenium");

        ve.decoller();
        System.out.println(VaisseauAncetre.getnbEnVol());
        ve.atterrir();
        VaisseauAncetre va2 = ve;

        ve.messageDarkvador("help");

        vr.massageR2D2("toto");

        ve.afficheCamp();
        vr.afficheCamp();
        va2.afficheCamp();

    }
}
