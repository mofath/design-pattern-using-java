
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author fathi
 */
class InternetProxy implements IProxy {
    List<String>bannedWebsite = Arrays.asList("facebook", "twitter");
    
    RealInternet realInternet = new RealInternet();

    @Override
    public void connectTo(String url) {
        if(bannedWebsite.contains(url)){
            System.out.println("You are not allowed to enter this site");
        } else {
            realInternet.connectTo(url);  }
    }
}
