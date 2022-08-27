package atm;

import dagger.Component;

@Component
public interface CommandRouterComponent {
    CommandRouter router();
}
