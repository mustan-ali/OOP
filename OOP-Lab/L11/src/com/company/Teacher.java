package com.company;

public class Teacher extends Person implements Employee {

    private String specialization;
    private int researchExperience;

    public Teacher(String name, int age, String gender, String specialization, int researchExperience) {
        super(name, age, gender);
        this.specialization = specialization;
        this.researchExperience = researchExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getResearchExperience() {
        return researchExperience;
    }

    @Override
    public double salary() {
        return 100000;
    }

    public String toString() {
        return "Person[Teacher Information:]\n" +
                "Teacher Name: " + super.getName() + "\n" +
                "Teacher Age: " + super.getAge() + "\n" +
                "Teacher Gender: " + super.getGender() + "\n" +
                "Teacher Specialization: " + getSpecialization() + "\n" +
                "Teacher Research Experience: " + getResearchExperience() + "\n";
    }
}
