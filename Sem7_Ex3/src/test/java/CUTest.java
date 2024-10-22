import org.example.CU;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the CU class.
 * This class contains unit tests for the methods in the CU class
 * to ensure proper functionality and correctness.
 *
 * @author 47719
 */
public class CUTest {

    private CU cu;

    /**
     * Sets up a new instance of the CU class before each test.
     * This method initializes the CU object with a specific name
     * and a maximum number of students.
     */
    @BeforeEach
    public void setUp() {
        cu = new CU("Mathematics", 5); // Creating a new CU with a maximum of 5 students
    }

    /**
     * Tests the insertMarkCU and searchStudent methods of the CU class.
     * This test inserts marks for two students and verifies
     * that the marks are correctly stored and retrieved.
     */
    @Test
    public void testInsertAndSearchStudent() {
        cu.insertMarkCU(1, 10.0);
        cu.insertMarkCU(2, 8.0);

        assertEquals(10.0, cu.searchStudent(1), "The mark for student 1 should be 10.0");
        assertEquals(8.0, cu.searchStudent(2), "The mark for student 2 should be 8.0");
        assertEquals(-1, cu.searchStudent(3), "Student 3 does not exist");
    }

    /**
     * Tests the averageCU method of the CU class.
     * This test inserts marks for three students and verifies
     * that the calculated average is correct.
     */
    @Test
    public void testAverageCU() {
        // Insert marks
        cu.insertMarkCU(1, 10.0);
        cu.insertMarkCU(2, 8.0);
        cu.insertMarkCU(3, 9.5);

        // Calculate expected average
        double expectedAverage = (10.0 + 8.0 + 9.5) / 3;
        assertEquals(expectedAverage, cu.averageCU(), 0.0001, "The average should be correct.");
    }

    /**
     * Tests the isApproved method of the CU class using parameterized tests.
     * This test checks whether students are approved based on their marks.
     *
     * @param numStudent the student number
     * @param mark the mark of the student
     */
    @ParameterizedTest
    @CsvSource({
            "1, 10.0",
            "2, 8.0",
            "3, 9.5"
    })
    public void testIsApproved(int numStudent, double mark) {
        cu.insertMarkCU(numStudent, mark);
        boolean expected = mark >= 9.5;
        assertEquals(expected, cu.isApproved(numStudent), "The approval status should be correct.");
    }
}
