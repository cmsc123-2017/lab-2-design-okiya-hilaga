import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ExamGradesTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCreateExamGrades() {
    double grades[] = new double[10];
    
    for (int i = 0; i < 10; i++) {
      grades[i] = 100 - i;
    }
    
    ExamGrades g = new ExamGrades(grades);
    
    assertEquals(100.0, g.grades[0]);
    assertEquals(91.0, g.grades[9]);
  }
  
  public void testHighestGrade() {
    double grades[] = new double[20];
    
    for (int i = 0; i < 20; i++) {
      grades[i] = 95.8  - i;
    }
    
    ExamGrades f = new ExamGrades(grades);
    
    assertEquals(95.8, f.grades[0]);
    assertEquals(85.8, f.grades[10]);
    assertEquals(76.8, f.grades[19]);
    
    assertEquals(95.8, f.highestGrade());
  }
}
