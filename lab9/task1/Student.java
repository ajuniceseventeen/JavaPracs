package lab9.task1;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private int ID;
    private int GPA;
    public Student(int id, int gpa) {
        ID = id;
        GPA = gpa;
    }
    public int getID() {
        return ID;
    }
    public int getGPA() {
        return GPA;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
    public String toString() {
        return "Student: ID=" + ID + ", GPA=" + GPA;
    }
}