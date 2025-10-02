package model;

/**
 * @author Vincent Velthuizen
 * Legt de eigenschappen van een rechthoek vast.
 */
public class Rechthoek {
    private static final double DEFAULT_LENGTE = 1.0;
    private static final double DEFAULT_BREEDTE = 2.0;
    private static final String DEFAULT_KLEUR = "geel";

    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksboven;
    private String kleur;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksboven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksboven = hoekpuntLinksboven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULT_KLEUR);
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET EERLIJK!!!";
        }
    }
}
