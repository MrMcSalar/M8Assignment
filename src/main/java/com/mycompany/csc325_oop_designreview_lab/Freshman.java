package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    public Freshman(String name, short age, int credits) {
        super(name, age, credits); //
    }

    // 10: Add a toString method for the Freshman class
    @Override
    public String toString() {
        return "Freshman{" + super.toString() + '}';
    }
}
