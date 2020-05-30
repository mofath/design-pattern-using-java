

/**
 *
 * @author fathi
 */
public class Customer implements Observer {
 
    private String name;
    
    Customer(String name){
        this.name = name;
    }
    

    @Override
    public void update(String productName, int price) {
        System.out.println("A new item is on sale! "+ productName +" laptop, "+ this.name +", with price "+ price);
    }
}