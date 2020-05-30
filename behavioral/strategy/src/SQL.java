
/**
 *
 * @author fathi
 */
public class SQL implements DB {

    @Override
    public void connect() {
        System.out.println("connected to SQL db");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected SQL db");
    }
}
