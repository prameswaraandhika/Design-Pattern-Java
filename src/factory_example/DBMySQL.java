package factory_example;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class DBMySQL implements ConnectionManager {

    @Override
    public void connect() {
        System.out.println("CONNECT ON DATABASE MYSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("DISCONNECT ON DATABASE MYSQL");
    }

}
