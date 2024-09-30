
package com.universal.student;

public class Student {
    public int rollnumber;
    public String Name;
    public double percentage;

    public Student(int rollnumber, String name, double percentage) {
        this.rollnumber = rollnumber;
        this.Name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return rollnumber+":"+Name+":"+percentage;
    }
    
    
}
