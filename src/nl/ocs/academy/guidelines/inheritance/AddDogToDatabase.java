package nl.ocs.academy.guidelines.inheritance;

import nl.ocs.academy.guidelines.databases.Database;

class AddDogToDatabase extends AddToDatabaseBaseClass {

    AddDogToDatabase(Database database) {
        super(database);
    }

    public void addDog() {
        addToDatabase("a dog");
    }
}
