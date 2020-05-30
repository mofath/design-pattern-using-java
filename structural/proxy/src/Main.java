
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fathi
 */
public class Main {
    public static void main(String[] args){
     List<String>websites; 
     websites= Arrays.asList("facebook","twitter",    	  	              "java", "tutorialspoint");
        
        IProxy iproxy = new InternetProxy();
        
        for(String url : websites){
            iproxy.connectTo(url);
        }
    }
}
