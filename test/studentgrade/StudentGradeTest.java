package studentgrade;

import junit.framework.TestCase;
import org.junit.Test;

/* JUnit 4.12 */

public class StudentGradeTest extends TestCase {

    public StudentGradeTest(String testName) {
        super(testName);
    }
    @Test
    public void test_grade_between_90_and_100() {
        System.out.println("Test Grade Between 90 and 100");
        assertEquals("A", StudentGrade.getGrade(90));
        assertEquals("A", StudentGrade.getGrade(95));
        assertEquals("A", StudentGrade.getGrade(100));
    }

    @Test
    public void test_grade_between_80_and_89() {
        System.out.println("Test Grade Between 80 and 89");
        assertEquals("B", StudentGrade.getGrade(80));
        assertEquals("B", StudentGrade.getGrade(85));
        assertEquals("B", StudentGrade.getGrade(89));
    }

    @Test
    public void test_grade_less_than_80() {
        System.out.println("Test Grade Between 90 and 100");
        assertEquals("F", StudentGrade.getGrade(0));
        assertEquals("F", StudentGrade.getGrade(50));
        assertEquals("F", StudentGrade.getGrade(79));
    }
}
