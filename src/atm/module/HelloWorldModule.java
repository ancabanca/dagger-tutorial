package atm.module;

import atm.command.Command;
import atm.command.HelloWorldCommand;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class HelloWorldModule {
    @Binds
    public abstract Command helloWorldCommand(HelloWorldCommand command);
}
