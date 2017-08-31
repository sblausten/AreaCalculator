import static org.junit.Assert.*;

import org.junit.Test;
import Shape;

public class AreaCalculatorTest {

	@Test
	public void AreaCalculator_ShouldCalculate100AreaForSquare() {
		Square square = new Square(10, 10);
		assertEquals(AreaCalculator.area(square), 100);
	}
	
	@Test
	public void AreaCalculator_ShouldCalculate200AreaForSquare() {
		Square square = new Square(20, 20);
		assertEquals(AreaCalculator.area(square), 400);
	}

}
