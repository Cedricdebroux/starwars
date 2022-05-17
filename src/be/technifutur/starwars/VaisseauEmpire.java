package be.technifutur.starwars;

public class VaisseauEmpire extends VaisseauAncetre {
    public VaisseauEmpire(String anom) {
        super(anom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis fidèle à l'empire");
    }

    public void messageDarkvador(String message) {
        System.out.println(message);
        System.out.println("Je suis ton père !!!");
    }


}
