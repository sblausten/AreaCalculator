import static org.junit.Assert.*;

import org.junit.Test;
import Shape;

public class AreaCalculatorTest {

	@Test
	public void AreaCalculator_ShouldCalculateAreaForSquare() {
		Square square = new Square(10, 10);
		assertEquals(AreaCalculator.area(square), 100);
	}

}
