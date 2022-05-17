package be.technifutur.starwars;

public class DeathStars {

    public void attireVaisseau(VaisseauAncetre v) {
        if (v instanceof VaisseauRebelle) {
            attireVaisseau((VaisseauRebelle) v);
        } else if (v instanceof VaisseauEmpire) {
            attireVaisseau((VaisseauEmpire) v);
        } else {
            v.atterrir();
            v.afficheCamp();
            v.decoller();
        }

    }

    public void attireVaisseau(VaisseauEmpire e) {
        e.atterrir();
        e.afficheCamp();
        e.messageDarkvador("à vos ordre");
    }

    public void attireVaisseau(VaisseauRebelle r) {
        r.atterrir();
        r.afficheCamp();
        System.out.println("A l'aide Obiwan");
        r.decoller();
    }
}
