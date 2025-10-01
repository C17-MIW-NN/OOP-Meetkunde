package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(6);
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(3, 1, 4, "blauw");

        for (int cirkel = 0; cirkel < mijnCirkelArray.length; cirkel++) {
            System.out.println(mijnCirkelArray[cirkel].geefOppervlakte());
            System.out.println(mijnCirkelArray[cirkel].vertelOverGrootte());
            System.out.println();
        }
    }

}
