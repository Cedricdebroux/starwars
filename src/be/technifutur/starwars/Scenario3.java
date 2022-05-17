package be.technifutur.starwars;

public class Scenario3 {
    public static void main(String[] args) {
        //VaisseauAncetre va = new VaisseauAncetre("Wing"); pas de new sur une class abstract
        VaisseauEmpire ve = new VaisseauEmpire("Xwing");
        VaisseauRebelle vr = new VaisseauRebelle("Millenium");
        DeathStars ds = new DeathStars();

        ve.decoller();
        System.out.println(VaisseauAncetre.getnbEnVol());
        ve.atterrir();
        ve.decoller();
        vr.decoller();
        VaisseauAncetre va2 = ve;

        ve.messageDarkvador("help");

        vr.massageR2D2("toto");

        ve.afficheCamp();
        vr.afficheCamp();
        va2.afficheCamp();

        System.out.println("-----étoile de la mort-----");

        ds.attireVaisseau(ve);
        ds.attireVaisseau(vr);
        ds.attireVaisseau(va2);

    }
}
