package atm.module;

import atm.command.Command;
import atm.command.HelloWorldCommand;
import dagger.Binds;
import dagger.Module;

public abstract class HelloWorldModule {
    public abstract Command helloWorldCommand(HelloWorldCommand command);
}
