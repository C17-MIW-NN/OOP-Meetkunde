package model;

/**
 * @author Vincent Velthuizen
 * Legt de eigenschappen van een cirkel vast.
 */
public class Cirkel extends Figuur {
    private static final int DEFAULT_STRAAL = 1;

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        super();
        setStraal(straal);
        this.middelpunt = new Punt();
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        double diameter = 2 * straal;
        return diameter < lengte && diameter < breedte;
    }

    @Override
    public String toString() {
        return String.format("%s\nStraal: %s\nMiddelpunt: %s", super.toString(), this.straal, this.middelpunt);
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            throw new IllegalArgumentException(
                    String.format("De straal moet positief zijn, %s is niet geldig.", straal));
        }

        this.straal = straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }
}
