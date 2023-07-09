package singleton_example;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class SingletonExample {

    /*
        Singleton, Ensures that only one object of a particular class is ever created.
        Jika kita sudah pernah menginstansiasi sebuah objek maka kita akan menginstansiasi dari objek yang sebelumnya sudah kita buat
        Alih alih menginstansi objek baru kita bisa memangil objek yang pernah kita instansiasi
        Jadi hanya perlu satu objek yang di instansiasi ketika membuat sebuah objek baru
     */
    public static void main(String[] args) {

//        User u1 = User.INSTANCE;
//        User u2 = User.INSTANCE;
//        System.out.println(u1.hashCode());
//        System.out.println(u2.hashCode());
        Admin admin = new Admin();
        admin.sendMessageToConsument();
        Consument consument = new Consument();
        consument.receivedMessageFromAdmin();

    }
}

class Admin {

    public void sendMessageToConsument() {
        MessageHelper messageHelper = MessageHelper.getInstance();
        System.out.println(messageHelper.hashCode());
        messageHelper.setData("message", "hi consument!");
    }
}

class Consument {

    public void receivedMessageFromAdmin() {
        MessageHelper messageHelper = MessageHelper.getInstance();
        System.out.println(messageHelper.hashCode());
        String message = messageHelper.containsData("message") ? messageHelper.getData("message").toString() : "data not found";
        System.out.println("Admin: " + message);
    }

}
