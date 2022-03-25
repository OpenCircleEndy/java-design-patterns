package nl.ocs.academy.guidelines.inheritance;

import nl.ocs.academy.guidelines.databases.Database;

class AddEmployeeToDatabase extends AddPersonToDatabase {

    AddEmployeeToDatabase(Database database) {
        super(database);
    }

    public void addEmployee() {
        addToDatabase("an employee");
    }
}
