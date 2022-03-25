package nl.ocs.academy.guidelines.composition;

class AddToDatabase {

    private ExecuteDatabaseCall executeDatabaseCall;
    private DataSupplier dataCollector;
    private DataValidator validator;

    AddToDatabase(ExecuteDatabaseCall executeDatabaseCall, DataSupplier dataCollector, DataValidator validator) {
        this.executeDatabaseCall = executeDatabaseCall;
        this.dataCollector = dataCollector;
        this.validator = validator;
    }

    public void addToDatabase() {
        String data = dataCollector.getData();
        if (validator.isValid(data)) executeDatabaseCall.execute(data);
    }
}
