package nl.ocs.academy.guidelines.inheritance;

import nl.ocs.academy.guidelines.databases.AnnoyingDatabase;
import nl.ocs.academy.guidelines.databases.Database;
import nl.ocs.academy.guidelines.databases.EnvisionedDatabase;

class Guideline {
    public static void main(String[] args) {
        Database envisionedDatabase = new EnvisionedDatabase();
        Database annoyingDatabase = new AnnoyingDatabase();

        AddDogToDatabase dogDao = new AddDogToDatabase(envisionedDatabase);
        AddPersonToDatabase personDao = new AddPersonToDatabase(envisionedDatabase);
        AddEmployeeToDatabase employeeDao = new AddEmployeeToDatabase(envisionedDatabase);

        dogDao.addDog();
        personDao.addPerson();
        employeeDao.addEmployee();

        try {
            new AddDogToDatabase(annoyingDatabase).addDog();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
