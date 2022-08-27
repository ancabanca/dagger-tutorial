package atm;

import atm.module.HelloWorldModule;
import dagger.Component;

@Component(modules = HelloWorldModule.class)
public interface CommandRouterComponent {
    CommandRouter router();
}
