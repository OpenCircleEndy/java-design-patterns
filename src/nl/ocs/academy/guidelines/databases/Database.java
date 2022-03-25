package nl.ocs.academy.guidelines.databases;

public sealed interface Database permits AnnoyingDatabase, EnvisionedDatabase {
    void executeQuery(String query);
}
