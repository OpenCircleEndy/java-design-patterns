package nl.ocs.academy.factorymethod;

import java.util.stream.Stream;

class Pattern {

    public static void main(String[] args) {
        Stream.of(new DesktopGui(), new BrowserGui()).forEach(gui -> gui.getButton().click());
    }
}
