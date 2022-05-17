package be.technifutur.starwars;

public class VaisseauRebelle extends VaisseauAncetre {

    public VaisseauRebelle(String anom) {
        super(anom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis un rebelle");
    }

    public void massageR2D2(String message) {
        System.out.println("bip bip");
    }

}
