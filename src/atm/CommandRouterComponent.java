package atm;

import atm.module.HelloWorldModule;
import atm.module.SystemOutModule;
import dagger.Component;

@Component(modules = {HelloWorldModule.class, SystemOutModule.class})
public interface CommandRouterComponent {
    CommandRouter router();
}
