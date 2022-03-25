package nl.ocs.academy.guidelines.composition;

@FunctionalInterface
public interface ExecuteDatabaseCall {
    void execute(String data);
}
