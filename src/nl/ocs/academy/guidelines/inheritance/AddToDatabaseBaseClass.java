package nl.ocs.academy.guidelines.inheritance;

import nl.ocs.academy.guidelines.databases.Database;

class AddToDatabaseBaseClass {

    private Database database;

    AddToDatabaseBaseClass(Database database) {
        this.database = database;
    }

    private void execute(String query) {
        if (query == null || query.contains("Insert")) throw new IllegalStateException("Invalid query");
        database.executeQuery("Insert " + query);
    }

    protected void addToDatabase(String query) {
        execute(query);
    }
}
