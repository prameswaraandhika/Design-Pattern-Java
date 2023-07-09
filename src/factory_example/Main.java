package factory_example;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class Main {

    /*
            Factory method is one of Creational pattern that uses a factory method to create objects
            without specifying concrete classes that needs to be created
    
            Kapan menggunakan pola metode Factory?
            1. Anda tidak tahu objek mana yang akan dibuat (Anda tahu objek mana yang akan dibuat hanya pada saat run time)
            2. Harus melakukan beberapa operasi untuk membuat objek
     */
    public static void main(String[] argsStrings) {
        ConnectionManager conn = ConnectionFactory.createDatabase("postgresql");
        conn.connect();
        conn.disconnect();

    }
}
