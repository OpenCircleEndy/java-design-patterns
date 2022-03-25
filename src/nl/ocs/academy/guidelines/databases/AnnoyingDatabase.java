package nl.ocs.academy.guidelines.databases;

public final class AnnoyingDatabase implements Database {

    private boolean ssl;

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    @Override
    public void executeQuery(String query) {
        if (ssl) System.out.println("[Secure] Execute query: " + query);
        else throw new IllegalStateException("SSL is disabled!");
    }
}
