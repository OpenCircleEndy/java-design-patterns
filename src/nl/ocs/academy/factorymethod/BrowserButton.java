package nl.ocs.academy.factorymethod;

class BrowserButton implements Button {
    @Override
    public void click() {
        System.out.println("Open some window with javascript errors.");
    }
}
