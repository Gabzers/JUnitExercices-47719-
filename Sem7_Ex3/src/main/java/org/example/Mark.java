package org.example;

/**
 * Class representing a student's mark.
 *
 * @author 47719
 */
public class Mark {
    private int numStudent;
    private double mark;

    /**
     * Constructor to create a new Mark.
     *
     * @param numStudent The student number.
     * @param mark The mark of the student.
     */
    public Mark(int numStudent, double mark) {
        this.numStudent = numStudent;
        this.mark = mark;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public double getMark() {
        return mark;
    }
}
