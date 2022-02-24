package nl.ocs.academy.di;

class InstancePerClassService implements Service {
    private final String context;

    public InstancePerClassService(String ctx) {
        context = ctx;
        System.out.println("Instantiated " + getClass().getSimpleName());
    }

    @Override
    public void postOnInstagram() {
        System.out.println("Instance per class posting during "+ context);
    }
}
