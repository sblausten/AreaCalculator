import java.math.BigDecimal;
import java.math.RoundingMode;

public class AreaCalculator {
	
	public static BigDecimal area(Shape shape) {
		return shape.calculateArea().setScale(2, RoundingMode.HALF_UP);
	}
}
