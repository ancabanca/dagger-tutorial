package atm;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommandRouter_Factory implements Factory<CommandRouter> {
  private static final CommandRouter_Factory INSTANCE = new CommandRouter_Factory();

  @Override
  public CommandRouter get() {
    return new CommandRouter();
  }

  public static CommandRouter_Factory create() {
    return INSTANCE;
  }

  public static CommandRouter newInstance() {
    return new CommandRouter();
  }
}
