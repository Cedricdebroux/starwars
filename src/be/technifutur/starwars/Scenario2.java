package be.technifutur.starwars;

import static be.technifutur.starwars.VaisseauSecurise.getnbEnVol;

public class Scenario2 {

    public static void main(String[] args) {
        VaisseauSecurise v1 = new VaisseauSecurise("Millenium");
        VaisseauSecurise v2 = new VaisseauSecurise("Xwing");
        // v1.nom = "Millenium"; ont ne peut plus modifier les nom car ils sont en private, donc non accessible depuis une autre class
        // v2.nom = "Xwing";
        v1.tirer();
        v1.addMissille(5);
        v1.tirer();

        v1.decoller();
        System.out.println("Nombre d'appareil en vol : " + getnbEnVol());
        v2.decoller();
        System.out.println("Nombre d'appareil en vol : " + getnbEnVol());
        v1.decoller();
        System.out.println("Nombre d'appareil en vol : " + getnbEnVol());
        v1.atterrir();
        System.out.println("Nombre d'appareil en vol : " + getnbEnVol());
        v1.atterrir();
        System.out.println("Nombre d'appareil en vol : " + getnbEnVol());
        v2.atterrir();
        System.out.println("Nombre d'appareil en vol : " + getnbEnVol());
    }

}
