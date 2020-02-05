package sandbox.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import sandbox.Square;

public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    s.area();
    Assert.assertEquals(s.area(), 25);
  }
}
