#### Notes for custom dependency management
Note that the project now uses Ivy, which uses Maven for dependency management. This below is not necessary anymore,
but it's good to understand that Dagger is split into compiler and runtime.
- Dagger library comes from `~/w/lib/dagger-2.43.2.jar`
- Dagger needs a compiler, which will generate the Dagger classes e.g. `CommandRouterFactory`: `dagger-compiler-2.22.jar`

### Dagger notes
https://dagger.dev/tutorial

- @Inject goes directly on a class constructor. It tells Dagger how to build the class straight from the constructor.

- @Provides method must be inside a module, and it is static. It tells Dagger how to build an object to whose
constructor I might not have access. Or maybe I just don't want an implementation, I just create a lambda
(like SystemOutModule).
  - Note the difference between creating and providing. The provider method might provide an object, without creating it
  every time it is invoked.

- @Binds method must be inside a module. It tells Dagger what implementation to build to satisfy an interface.

- @Component is the entry point. It builds one object by looking at its constructor's dependencies (and so on).
It also looks at all the modules installed in this component.
