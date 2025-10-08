package controller;

import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Cirkel> cirkels = new ArrayList<>();

        File stralenbestand = new File("resources/stralen.txt");

        try {
            Scanner bestandLezer = new Scanner(stralenbestand);

            while (bestandLezer.hasNextDouble()) {
                double straal = bestandLezer.nextDouble();
                cirkels.add(new Cirkel(straal));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het is niet gelukt het stralenbestand te openen");
            System.out.println(fileNotFoundException.getMessage());
        }

        for (Cirkel cirkel : cirkels) {
            System.out.println(cirkel);
            System.out.println();
        }
    }

    public static void toonInformatie(Figuur figuur) {
            System.out.println(figuur);
            System.out.println(figuur.vertelOverGrootte());
            System.out.println();
    }

}
