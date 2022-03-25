package nl.ocs.academy.guidelines.inheritance;

import nl.ocs.academy.guidelines.databases.Database;

class AddPersonToDatabase extends AddToDatabaseBaseClass {

    AddPersonToDatabase(Database database) {
        super(database);
    }

    public void addPerson() {
        addToDatabase("a person");
    }

    @Override
    protected void addToDatabase(String query) {
        if (query == null || query.contains("BSN")) throw new IllegalArgumentException(("Must not store BSN!"));
        super.addToDatabase(query);
    }
}
