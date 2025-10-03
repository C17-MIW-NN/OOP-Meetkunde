package model;

/**
 * @author Vincent Velthuizen
 * Legt de eigenschappen van een rechthoek vast.
 */
public class Rechthoek extends Figuur {
    private static final double DEFAULT_LENGTE = 1.0;
    private static final double DEFAULT_BREEDTE = 2.0;

    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksboven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksboven, String kleur) {
        super(kleur);
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksboven = hoekpuntLinksboven;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), getDefaultKleur());
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public String toString() {
        return String.format("%s\nLengte: %.2f\nBreedte: %.2f\nHoekpuntLinksboven: %s",
                super.toString(), this.lengte, this.breedte, this.hoekpuntLinksboven);
    }

    public Punt getHoekpuntLinksboven() {
        return hoekpuntLinksboven;
    }
}
