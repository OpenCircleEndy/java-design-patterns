package nl.ocs.academy.factorymethod;

class DesktopGui extends SomeGui {
    @Override
    Button createButton() {
        return new DesktopButton();
    }
}
