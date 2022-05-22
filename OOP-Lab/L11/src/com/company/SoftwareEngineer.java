package com.company;

public class SoftwareEngineer extends Person implements Employee {

    private String specialization;
    private int developmentExperience;

    public SoftwareEngineer(String name, int age, String gender, String specialization, int developmentExperience) {
        super(name, age, gender);
        this.specialization = specialization;
        this.developmentExperience = developmentExperience;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getDevelopmentExperience() {
        return this.developmentExperience;
    }

    public void setDevelopmentExperience(int developmentExperience) {
        this.developmentExperience = developmentExperience;
    }

    @Override
    public double salary() {
        return 75000;
    }
    
    public String toString() {
        return "Person[Software Engineer Information:]\n" +
                "Name: " + super.getName() + "\n" +
                "Age: " + super.getAge() + "\n" +
                "Gender: " + super.getGender() + "\n" +
                "Specialization: " + getSpecialization() + "\n" +
                "Research Experience: " + getDevelopmentExperience() + "\n";
    }
}
