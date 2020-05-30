
/**
 *
 * @author fathi
 */
class RealInternet implements IProxy {

    @Override
    public void connectTo(String url) {
        System.out.println("http://"+url+".com");
    }
}
