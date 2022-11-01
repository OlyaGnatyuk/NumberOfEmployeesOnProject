package org.example;

public class NumberOfEmployeesOnProject {
    public static void main(String[] args) {
        int programmersOnProjectNumber = 5;
        int qaForOneProgrammerNumber = 2;
        int supportSpecialistForOneProgrammerNumber = 3;
        int requiredNumberOfQaOnProject = qaForOneProgrammerNumber * programmersOnProjectNumber;
        int requiredNumberOfSupportSpecialistsOnProject = supportSpecialistForOneProgrammerNumber * programmersOnProjectNumber;
        int totalEmployeesNumber = programmersOnProjectNumber + requiredNumberOfQaOnProject + requiredNumberOfSupportSpecialistsOnProject;
    }
}
