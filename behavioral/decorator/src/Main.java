
/**
 *
 * @author fathi
 */
public class Main {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}

