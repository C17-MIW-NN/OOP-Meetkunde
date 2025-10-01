package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnEersteCirkel = new Cirkel(6);

        System.out.println(Cirkel.aantalCirkels);

        Cirkel mijnTweedeCirkel = new Cirkel();
        Cirkel mijnDerdeCirkel = new Cirkel();

        System.out.println(Cirkel.geefDefinitie());

        System.out.println(mijnEersteCirkel.geefOmtrek());
        System.out.println(mijnEersteCirkel.geefOppervlakte());

    }

}
