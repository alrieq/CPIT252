package onetwothree;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LoggerTest 
{
   
    @Test
  public void shouldBeIdenticals()
  {
    Logger log1 = Logger.getInstance();
    Logger log2 = Logger.getInstance();
    assertEquals(log1, log2);
  }
}
