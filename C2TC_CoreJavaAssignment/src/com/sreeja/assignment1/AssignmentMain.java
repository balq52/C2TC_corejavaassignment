package com.sreeja.assignment1;
import com.sreeja.assignment1.employees.Developer;
import com.sreeja.assignment1.employees.Manager;
import com.sreeja.assignment1.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the functionality of Employee, Manager, and Developer.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager m1 = new Manager("Abinaya", 101, 75000, "HR");
        Developer d1 = new Developer("Nithiya", 102, 65000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(m1);
        System.out.println("Department: " + m1.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(d1);
        System.out.println("Programming Language: " + d1.getProgrammingLanguage());

        // Give raise
        System.out.println("\nGiving raise...");
        EmployeeUtilities.giveRaise(m1, 5000);
        EmployeeUtilities.giveRaise(d1, 4000);

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.displayEmployeeDetails(m1);
        EmployeeUtilities.displayEmployeeDetails(d1);
    }
}
