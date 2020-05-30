
import java.util.ArrayList;

/**
 *
 * @author fathi
 */
 interface Product {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers();
}
