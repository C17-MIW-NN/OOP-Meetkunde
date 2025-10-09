package database;

import model.Figuur;

import java.sql.SQLException;

/**
 * @author Vincent Velthuizen
 * Zet figuren in de DB
 */
public abstract class FiguurDAO extends AbstractDAO {

    public FiguurDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    protected int slaFiguurOp(Figuur figuur) {
        String sql = "INSERT INTO figuur (kleur) VALUES (?);";
        setupPreparedStatementWithKey(sql);

        try {
            getPreparedStatement().setString(1, figuur.getKleur());
        } catch (SQLException sqlException) {
            sqlExceptionWarning(sqlException);
        }

        return executeInsertStatementWithKey();
    }
}
