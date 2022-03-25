package nl.ocs.academy.guidelines.composition;

import nl.ocs.academy.guidelines.databases.AnnoyingDatabase;
import nl.ocs.academy.guidelines.databases.Database;
import nl.ocs.academy.guidelines.databases.EnvisionedDatabase;

import java.util.stream.Stream;

class Guideline {

    public static void main(String[] args) {

        Database envisionedDatabase = new EnvisionedDatabase();
        AnnoyingDatabase annoyingDatabase = new AnnoyingDatabase();

        ExecuteDatabaseCall executeStandardDatabaseCall = new EnvisionedDatabaseCall(envisionedDatabase);
        ExecuteDatabaseCall executeAnnoyingDatabaseCall = new AnnoyingDatabaseCall(annoyingDatabase);

        DataSupplier dogSupplier = () -> "a dog";

        DataValidator personValidator = new PersonValidator();
        DataValidator standardValidator = new StandardValidator();

        Stream.of(
            new AddToDatabase(executeStandardDatabaseCall, dogSupplier, standardValidator),
            new AddToDatabase(executeStandardDatabaseCall, () -> "a person", personValidator),
            new AddToDatabase(executeStandardDatabaseCall, () -> "an employee", personValidator)
        ).forEach(AddToDatabase::addToDatabase);

        try {
            new AddToDatabase(executeAnnoyingDatabaseCall, dogSupplier, standardValidator).addToDatabase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
