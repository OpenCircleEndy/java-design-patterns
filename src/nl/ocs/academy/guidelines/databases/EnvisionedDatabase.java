package nl.ocs.academy.guidelines.databases;

public final class EnvisionedDatabase implements Database {
    @Override
    public void executeQuery(String query) {
        System.out.println("Execute query: " + query);
    }
}
