import static org.junit.Assert.*;

import org.junit.Test;
import Shape;

public class AreaCalculatorTest {

	@Test
	public void AreaCalculator_ShouldCalculate100AreaForSquare() {
		Shape square = new Square(10.0);
		assertEquals(AreaCalculator.area(square), Double.valueOf(100));
	}
	
	@Test
	public void AreaCalculator_ShouldCalculate400AreaForSquare() {
		Shape square = new Square(20.0);
		assertEquals(AreaCalculator.area(square), Double.valueOf(400));
	}
	
	@Test
	public void AreaCalculator_ShouldCalculateAreaForRectangle() {
		Shape rectangle = new Rectangle(30.0, 10.0);
		assertEquals(AreaCalculator.area(rectangle), Double.valueOf(300));
	}

}
