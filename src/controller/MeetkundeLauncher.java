package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(6);
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(3, new Punt(1, 4), "blauw");

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel].geefOppervlakte());
            System.out.println(mijnCirkelArray[cirkel].vertelOverGrootte());
            System.out.println(mijnCirkelArray[cirkel].getMiddelpunt().getxCoordinaat());
            System.out.println();
        }

        Rechthoek[] rechthoeken = new Rechthoek[3];

        rechthoeken[0] = new Rechthoek();
        rechthoeken[1] = new Rechthoek(4, 8);
        rechthoeken[2] = new Rechthoek(10, 15, new Punt(3, -4), "rood");

        for (int rechthoek = 0; rechthoek < rechthoeken.length; rechthoek++) {
            System.out.println(rechthoeken[rechthoek].vertelOverGrootte());
            System.out.println();
        }
    }

}
