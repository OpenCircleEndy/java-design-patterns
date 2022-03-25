package nl.ocs.academy.guidelines.composition;

public class PersonValidator implements DataValidator {
    @Override
    public boolean isValid(String data) {
        if (data == null || data.contains("BSN")) throw new IllegalArgumentException(("Must not store BSN!"));
        return true;
    }
}
