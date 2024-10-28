package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < 85) { // 8: The senior class should have a minimum of 85 credits
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
    }

    //11: Add a toString method for the Senior class
    @Override
    public String toString() {
        return "Senior{" + super.toString() + '}';
    }
}
