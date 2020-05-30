package command;

/**
 *
 * @author fathi
 */
public class Off implements Command {

    Tv tv;

    Off(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.off();
    }

    @Override
    public void unexecute() {
        this.tv.on();
    }
}
