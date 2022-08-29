package atm.module;

import atm.Outputter;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SystemOutModule {
    @Provides
    public static Outputter getOutputter() {
        return System.out::println;
    }
}
