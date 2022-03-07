package com.company;

public class Employee {

    private int id, salary;
    private String firstName, middleName, lastName, address;
    private byte age;


    public Employee(int id, String firstName, String middleName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getAddress() {
        return this.address;
    }

    public byte getAge() {
        return this.age;
    }

    public int getAnnualSalary() {
        return 12 * this.salary;
    }

    public int raiseSalary(int percent) {
        float percentage = ((float) percent / 100);
        this.salary += salary * percentage;
        return salary;
    }

    public String toString() {
        return "Employee [ id=" + getId() + " --- FullName: " + getFullName() + " --- Salary = Rs." + getSalary()
                + " --- Age = " + getAge() + " --- Address: " + getAddress() + " ]";
    }

}