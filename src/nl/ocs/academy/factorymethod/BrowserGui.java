package nl.ocs.academy.factorymethod;

class BrowserGui extends SomeGui {
    @Override
    Button createButton() {
        return new BrowserButton();
    }
}
