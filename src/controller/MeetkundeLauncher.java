package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();

        File rechthoekenbestand = new File("resources/rechthoeken.csv");

        try {
            Scanner bestandLezer = new Scanner(rechthoekenbestand);

            while (bestandLezer.hasNextLine()) {
                String[] rechthoekData = bestandLezer.nextLine().split(",");

                double lengte = Double.parseDouble(rechthoekData[0]);
                double breedte = Double.parseDouble(rechthoekData[1]);
                double xCoordinaat = Double.parseDouble(rechthoekData[2]);
                double yCoordinaat = Double.parseDouble(rechthoekData[3]);
                String kleur = rechthoekData[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het is niet gelukt het rechthoekenbestand te openen");
            System.out.println(fileNotFoundException.getMessage());
        }

        for (Rechthoek rechthoek : rechthoeken) {
            System.out.println(rechthoek);
            System.out.println();
        }
    }

    public static void toonInformatie(Figuur figuur) {
            System.out.println(figuur);
            System.out.println(figuur.vertelOverGrootte());
            System.out.println();
    }

}
