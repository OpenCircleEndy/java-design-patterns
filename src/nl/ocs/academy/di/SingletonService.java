package nl.ocs.academy.di;

class SingletonService implements Service {
    private static SingletonService instance;

    static SingletonService getInstance(String context) {
        if (instance == null) {
            instance = new SingletonService(context);
        }
        return instance;
    }

    private final String context;

    SingletonService(String ctx) {
        context = ctx;
        System.out.println("Instantiated " + getClass().getSimpleName());
    }

    @Override
    public void postOnInstagram() {
        System.out.println("Singleton posting during " + context);
    }
}
