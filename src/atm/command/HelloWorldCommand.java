package atm.command;

import java.util.List;
import javax.inject.Inject;

import atm.Outputter;

public final class HelloWorldCommand implements Command {
    private final Outputter outputter;

    @Inject
    public HelloWorldCommand(Outputter outputter) {
        this.outputter = outputter;
    }

    @Override
    public String key() {
        return "hello";
    }

    @Override
    public Status handleInput(List<String> input) {
        if (!input.isEmpty()) {
            return Status.INVALID;
        }

        this.outputter.output("world!");

        return Status.HANDLED;
    }
}
