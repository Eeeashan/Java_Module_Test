package accounts;

import java.io.IOException;
import java.sql.SQLException;

import static db.DbConnection.connectMySql;
import static db.DbConnection.readDatabase;

public class App {

    /**
     * @author Jahidul Islam
     * Use methods from the SalaryCalculator class to calculate salary of an employee
     *
     * */

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        // Implement here
        connectMySql();

    }
}
