package com.sreeja.assignment1.employees;


public class Employee {
    private String name;       // private -> accessible only within class
    private int employeeId;    // private attribute
    private double salary;     // private attribute

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { // protected -> accessible in same package & subclasses
        this.salary = salary;
    }
}
