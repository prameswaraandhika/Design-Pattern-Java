package factory_example;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class ConnectionFactory {

    public static ConnectionManager createDatabase(String name) {
        if (name.equalsIgnoreCase("postgresql")) {
            return new DBPostgreSQL();
        } else if (name.equalsIgnoreCase("mysql")) {
            return new DBMySQL();
        } else {
            return null;
        }
    }
}
