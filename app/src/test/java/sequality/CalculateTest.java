package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest
{
  @Test
  public void testSum()
  {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSumAve()
  {
    Calculate calculate = new Calculate();
    int expected = 13.5;
    assertEquals(expected, calculate.sumAve(9, 18));
  }

  @Test
  public void testTotal()
  {
    Calculate calculate = new Calculate();
    int expected = 135;
    assertEquals(expected, calculate.total(9, 18));
  }

  @Test
  public void testTotalAve()
  {
    Calculate calculate = new Calculate();
    int expected = 58.5;
    assertEquals(expected, calculate.totalAve(9, 18));
  }
}
