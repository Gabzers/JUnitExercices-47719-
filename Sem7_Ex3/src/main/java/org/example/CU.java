package org.example;

import java.util.ArrayList;

/**
 * Class representing a curricular unit (CU) with marks for students.
 *
 * @author 47719
 */
public class CU {
    private String nameCU; // Name of the curricular unit
    private ArrayList<Mark> marks; // Array list of marks for each student
    private int totalStudents; // Maximum number of students in the CU

    /**
     * Constructor to create a new CU.
     *
     * @param nameCU The name of the curricular unit.
     * @param totalStudents The maximum number of students in the CU.
     */
    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }

    /**
     * Inserts a mark for a student.
     *
     * @param numStudent The student number.
     * @param mark The mark to insert.
     */
    public void insertMarkCU(int numStudent, double mark) {
        if (marks.size() < totalStudents) {
            marks.add(new Mark(numStudent, mark));
        }
    }

    /**
     * Searches for a student's mark.
     *
     * @param numStudent The student number to search for.
     * @return The mark of the student, or -1 if the student does not exist.
     */
    public double searchStudent(int numStudent) {
        for (Mark m : marks) {
            if (m.getNumStudent() == numStudent) {
                return m.getMark();
            }
        }
        return -1; // Student not found
    }

    /**
     * Calculates the average mark of the CU.
     *
     * @return The average mark, or 0 if there are no marks.
     */
    public double averageCU() {
        if (marks.isEmpty()) return 0;

        double total = 0;
        for (Mark m : marks) {
            total += m.getMark();
        }
        return total / marks.size();
    }

    /**
     * Checks if a student is approved in the CU.
     *
     * @param numStudent The student number.
     * @return True if the student is approved (mark >= 9.5), false otherwise.
     */
    public boolean isApproved(int numStudent) {
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
}
