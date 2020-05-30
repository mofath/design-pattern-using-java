
/**
 *
 * @author fathi
 */
public class NoSQL implements DB{

    @Override
    public void connect() {
        System.out.println("connected to NoSQL db");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected NoSQL db");
    }
    
}
