package command;

/**
 *
 * @author fathi
 */
public class Main {

    public static void main(String[] args) {
        
        Tv tv = new Tv();
        Command on = new On(tv);
        Command off = new Off(tv);
        
        RemoteInvoker control = new RemoteInvoker();
        
        
        control.setCommand(on);
        control.press();
        
        control.setCommand(off);
        control.press();
        
        control.recal();
    }
}
