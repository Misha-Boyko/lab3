import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {0, 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1, 0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {-3, -3, -3, 4, 6};
    double result1 = (-3-3+4+6)/(4.0);
    assertEquals(result1, ArrayExamples.averageWithoutLowest(input1), 0.000001);
  }
}
