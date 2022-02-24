package nl.ocs.academy.factorymethod;

class DesktopButton implements Button {
    @Override
    public void click() {
        System.out.println("Open some window");
    }
}
