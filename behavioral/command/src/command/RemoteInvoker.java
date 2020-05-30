package command;

/**
 *
 * @author fathi
 */
public class RemoteInvoker {
    Command command;
    
    void setCommand(Command command){
        this.command = command;
    }
    
    void press() {
        command.execute();
    }
    
    void recal(){
        command.unexecute();
    }
}
