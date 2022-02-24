package nl.ocs.academy.di;

class ServiceInjector {

    private Boolean singleton;

    ServiceInjector(Boolean instancePerClass) {
        singleton = !instancePerClass;
    }

    Service createService() {
        String context = "OCS Demo " + Math.random();

        if (singleton) {
            return SingletonService.getInstance(context);
        } else  {
            return new InstancePerClassService(context);
        }
    }
}
