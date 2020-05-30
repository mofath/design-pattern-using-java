
/**
 *
 * @author fathi
 */
abstract class Beverage {
    String desciption = "unknown beverage";
    
    public String getDescription(){
        return desciption;
    }
    
    public abstract int cost();
}
