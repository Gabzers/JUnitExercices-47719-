import org.example.Mark;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Mark class.
 *
 * @author 47719
 */
public class MarkTest {

    @Test
    public void testMarkCreation() {
        Mark mark = new Mark(1, 10.0);
        assertEquals(1, mark.getNumStudent(), "The student number should be 1.");
        assertEquals(10, mark.getMark(), "The mark should be 10.0.");
    }

    @Test
    public void testNegativeMark() {
        Mark mark = new Mark(2, -5.0);
        assertEquals(2, mark.getNumStudent(), "The student number should be 2.");
        assertEquals(-5.0, mark.getMark(), "The mark should be -5.0.");
    }
}
