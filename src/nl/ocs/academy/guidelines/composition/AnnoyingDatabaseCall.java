package nl.ocs.academy.guidelines.composition;

import nl.ocs.academy.guidelines.databases.AnnoyingDatabase;

class AnnoyingDatabaseCall implements ExecuteDatabaseCall {

    private AnnoyingDatabase database;

    AnnoyingDatabaseCall(AnnoyingDatabase database) {
        this.database = database;
    }
    
    @Override
    public void execute(String data) {
        database.setSsl(true);
        database.executeQuery("Insert " + data);
    }
}
