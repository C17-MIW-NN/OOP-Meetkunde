package model;

/**
 * @author Vincent Velthuizen
 * Legt de eigenschappen van een cirkel vast.
 */
public class Cirkel {
    private static final int DEFAULT_STRAAL = 1;
    private static final String DEFAULT_KLEUR = "geel";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static int aantalCirkels = 0;

    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        setStraal(straal);
        this.middelpunt = middelpunt;
        this.kleur = kleur;

        aantalCirkels++;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET EERLIJK!!!";
        }
    }

    public static int getAantalCirkels() {
        return aantalCirkels;
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
