import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

public class AreaCalculatorTest {

	@Test
	public void AreaCalculator_ShouldCalculate100AreaForSquare() {
		BigDecimal side = new BigDecimal(10);
		Shape square = new Square(side);
		BigDecimal expectedArea = new BigDecimal(100).setScale(2, RoundingMode.HALF_UP);
		assertEquals(AreaCalculator.area(square), expectedArea);
	}
	
	@Test
	public void AreaCalculator_ShouldCalculateAreaForRectangle() {
		BigDecimal width = new BigDecimal(10);
		BigDecimal length = new BigDecimal(30);
		Shape rectangle = new Rectangle(length, width);
		BigDecimal expectedArea = new BigDecimal(300).setScale(2, RoundingMode.HALF_UP);
		assertEquals(AreaCalculator.area(rectangle), expectedArea);
	}
	
	@Test
	public void AreaCalculator_ShouldCalculateAreaForCircle() {
		BigDecimal radius = new BigDecimal(10);
		Shape circle = new Circle(radius);
		BigDecimal expectedArea = new BigDecimal(314.16).setScale(2, RoundingMode.HALF_UP);
		assertEquals(AreaCalculator.area(circle), expectedArea);
	}

}
