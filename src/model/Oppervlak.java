package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vincent Velthuizen
 * Een plek om meetkundige figuren op te plaatsen.
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> figuren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.figuren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuur.pastInOppervlak(lengte, breedte)) {
            figuren.add(figuur);
            System.err.println("Dit figuur is toegevoegd");
        } else {
            System.err.println("Dit figuur is te groot");
        }
    }

    @Override
    public String toString() {
        Collections.sort(figuren);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mijn oppervlak bevat:\n");
        stringBuilder.append(String.format("Dit oppervlak heeft een lengte van %.2f en een breedte van %.2f",
                lengte, breedte));

        for (Figuur figuur : figuren) {
            stringBuilder.append("\n\n").append(figuur.toString());
        }

        stringBuilder.append("\nDit was mijn oppervlak, dank voor u aandacht");

        return stringBuilder.toString();
    }
}
