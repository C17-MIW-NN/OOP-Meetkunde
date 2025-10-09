package controller;

import database.CirkelDAO;
import database.DBaccess;
import database.PuntDAO;
import model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.sql.*;
import java.util.*;

/**
 * @author Vincent Velthuizen
 * Spelen met Meetkundige objecten
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("Figuren", "userFiguren", "userFigurenPW");
        CirkelDAO cirkelDAO = new CirkelDAO(dBaccess);

        for (Cirkel cirkel : cirkelDAO.haalCirkelsOp()) {
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
