package model;

/**
 * @author Vincent Velthuizen
 * Een punt in de 2D ruimte
 */
public class Punt {
    private static final double DEFAULT_X_COORDINAAT = 0.0;
    private static final double DEFAULT_Y_COORDINAAT = 0.0;

    private final double xCoordinaat;
    private final double yCoordinaat;

    public Punt(double xCoordinaat, double yCoordinaat) {
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
    }

    public Punt() {
        this(DEFAULT_X_COORDINAAT, DEFAULT_Y_COORDINAAT);
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }
}
