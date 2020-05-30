package command;

/**
 *
 * @author fathi
 */
public class On implements Command {

    Tv tv;

    On(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
    }

    @Override
    public void unexecute() {
        this.tv.off();
    }
}
