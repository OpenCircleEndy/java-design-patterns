package nl.ocs.academy.di;

import java.util.stream.Stream;

class Application {
    private final ServiceInjector serviceInjector;

    Application(Boolean instancePerClass) {
        serviceInjector = new ServiceInjector(instancePerClass);
    }

    void constructAndRun() {
        System.out.println("\n ----- Initializing Application ------");
        Stream<Client> beans = Stream.of(
            new Client(serviceInjector),
            new Client(serviceInjector),
            new Client(serviceInjector),
            new Client(serviceInjector),
            new Client(serviceInjector)
        );
        System.out.println("\n ----- Running Application ------");
        beans.forEach(Client::run);
    }
}
