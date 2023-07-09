package factory_example;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class DBPostgreSQL implements ConnectionManager {

    @Override
    public void connect() {
        System.out.println("CONNECT ON DATABASE POSTGRESQL");
    }

    @Override
    public void disconnect() {
        System.out.println("DISCONNECT ON DATABASE POSTGRESQL");
    }

}
