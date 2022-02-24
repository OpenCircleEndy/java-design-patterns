package nl.ocs.academy.di;

class Client {
    private Service service;

    Client(ServiceInjector serviceInjector) {
        service = serviceInjector.createService();
        System.out.println("Instantiated " + getClass().getSimpleName());
    }

    void run() {
        eat();
        service.postOnInstagram();
    }

    private void eat() {
        System.out.println("Let's have dinner...");
    }
}
