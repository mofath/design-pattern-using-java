
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author fathi
 */
public class Laptop implements Product{
    private String type;
    private int price;
    private List<Observer> customers = new ArrayList<>();
    
    Laptop(String type, int price){
        this.type = type;
        this.price = price;
    }
   

    @Override
    public void addSubscriber(Observer customer) {
        customers.add(customer);
    }
    @Override
    public void removeSubscriber(Observer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifySubscribers() {
        for(Observer customer: customers) {
            customer.update(this.type, this.price);
        }
    }
}
