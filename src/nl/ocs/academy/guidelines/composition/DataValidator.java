package nl.ocs.academy.guidelines.composition;

@FunctionalInterface
public interface DataValidator {
    boolean isValid(String data);
}
