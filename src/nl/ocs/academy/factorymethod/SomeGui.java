package nl.ocs.academy.factorymethod;

abstract class SomeGui {
    private Button button;

    SomeGui() {
        button = createButton();
    }

    abstract Button createButton();

    Button getButton() {
        return button;
    }
}
