package singleton_example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class MessageHelper {

    private static MessageHelper instance;
    private Map<String, String> data;

    public MessageHelper() {
        this.data = new HashMap<>();
    }

    public static MessageHelper getInstance() {
        if (instance == null) {
            synchronized (MessageHelper.class) {
                if (instance == null) {
                    instance = new MessageHelper();
                }
            }
        }
        return instance;
    }

    public Object getData(String key) {
        return data.get(key);
    }

    public void setData(String message, String content) {
        data.put(message, content);
    }

    public boolean containsData(String key) {
        return data.containsKey(key);
    }

}
