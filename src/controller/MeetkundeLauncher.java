package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Figuur[] figuren = new Figuur[3];

        figuren[0] = new Cirkel();
        figuren[1] = new Rechthoek();
        figuren[2] = new Cirkel(6);

        for (int index = 0; index < figuren.length; index++) {
            toonInformatie(figuren[index]);
        }
    }

    public static void toonInformatie(Figuur figuur) {
            System.out.println(figuur);
            System.out.println(figuur.vertelOverGrootte());
            System.out.println();
    }

}
