package nl.ocs.academy.guidelines.composition;

public class StandardValidator implements DataValidator {
    @Override
    public boolean isValid(String data) {
        if (data == null || data.contains("Insert")) throw new IllegalStateException("Invalid query");
        return true;
    }
}
