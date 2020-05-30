
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fathi
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        Product lap1 = new Laptop("lenovo", 1000);
        Observer customer1 = new Customer("ahmed");
        Observer customer2 = new Customer("mhmd");
        Observer customer3 = new Customer("heba");

        // Adding two customers to the newsletter
        lap1.addSubscriber(customer1);
        lap1.addSubscriber(customer2);
        lap1.addSubscriber(customer3);

        // Notifying customers (observers)
        lap1.notifySubscribers();

        // A customer has decided not to continue following the newsletter
        lap1.removeSubscriber(customer1);

        System.out.println("\n\n");

        // Notifying the updated list of customers
        lap1.notifySubscribers();
    }
}
