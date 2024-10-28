package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {// 1: Make this class a child of Human
    private double gpa; // 3: Add a field for GPA
    private int credits; // To hold credits

    public Student(String name, short age, int credits) {
        super(name, age); // 6: Fix the constructor of the Student class
        this.credits = credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return "Address not set";
    }

    @Override
    public void setAddress(String address) {
    }

    // 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", gpa=" + gpa + ", credits=" + credits + '}';
    }
}
