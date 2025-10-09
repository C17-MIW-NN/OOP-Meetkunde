package database;

import model.Punt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Schrijf punten naar of haal punten uit de database
 */
public class PuntDAO extends AbstractDAO {

    public PuntDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaPuntOp(Punt punt) {
        String sql = "INSERT INTO Punt VALUES (?, ?);";
        setupPreparedStatement(sql);

        try {
            getPreparedStatement().setDouble(1, punt.getxCoordinaat());
            getPreparedStatement().setDouble(2, punt.getyCoordinaat());
        } catch (SQLException sqlException) {
            sqlExceptionWarning(sqlException);
        }

        executeManipulateStatement();
    }

    public ArrayList<Punt> getPunten() {
        ArrayList<Punt> punten = new ArrayList<>();
        String sql = "SELECT xcoordinaat, ycoordinaat FROM Punt;";

        setupPreparedStatement(sql);

        try {
            ResultSet resultSet = executeSelectStatement();

            while (resultSet.next()) {
                double xCoordinaat = resultSet.getDouble("xcoordinaat");
                double yCoordinaat = resultSet.getDouble("ycoordinaat");

                punten.add(new Punt(xCoordinaat, yCoordinaat));
            }
        } catch (SQLException sqlException) {
            System.err.println("SQL Exception: " + sqlException.getMessage());
        }

        return punten;
    }
}
