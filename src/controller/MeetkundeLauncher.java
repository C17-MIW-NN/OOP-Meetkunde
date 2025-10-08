package controller;

import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak oppervlak = new Oppervlak(20, 35);

        Scanner toetsenbord = new Scanner(System.in);

        double straal = 0.0;
        do {
            System.out.print("Welke straal moet de volgende Cirkel hebben? ");

            try {
                straal = toetsenbord.nextDouble();
                oppervlak.voegFiguurToe(new Cirkel(straal));
            } catch (IllegalArgumentException illegalArgumentException) {
                System.err.println(illegalArgumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                String fouteInput = toetsenbord.nextLine();
                System.err.println(fouteInput + " was geen geldig komma-getal, probeer het opnieuw!");
            } finally {
                System.out.println("De try-catch heeft zijn werk gedaan.");
            }
        } while (straal != 1.0);

//        System.out.println(oppervlak);
    }

    public static void toonInformatie(Figuur figuur) {
            System.out.println(figuur);
            System.out.println(figuur.vertelOverGrootte());
            System.out.println();
    }

}
