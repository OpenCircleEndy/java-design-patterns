package nl.ocs.academy.guidelines.composition;

import nl.ocs.academy.guidelines.databases.Database;

class EnvisionedDatabaseCall implements ExecuteDatabaseCall {

    private Database database;

    EnvisionedDatabaseCall(Database database) {
        this.database = database;
    }

    @Override
    public void execute(String data) {
        database.executeQuery("Insert " + data);
    }
}
