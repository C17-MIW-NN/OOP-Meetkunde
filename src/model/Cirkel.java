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

        System.out.println(getKleur());
    }

    public Cirkel(double straal) {
        this.straal = straal;
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
    public String toString() {
        return String.format("%s\nStraal: %s\nMiddelpunt: %s", super.toString(), this.straal, this.middelpunt);
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.err.printf("De straal moet positief zijn. De straal wordt nu op %d gezet.\n", DEFAULT_STRAAL);
            straal = DEFAULT_STRAAL;
        }

        this.straal = straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }
}
