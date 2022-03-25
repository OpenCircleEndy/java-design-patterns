package nl.ocs.academy.di;

import java.util.stream.Stream;

class Pattern {
    public static void main(String[] args) {
        Stream.of(new Application(true), new Application(false)).forEach(Application::constructAndRun);
        System.out.println("Hello world!");
    }
}
