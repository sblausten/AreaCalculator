import java.math.BigDecimal;

public class Circle implements Shape {
	
	private BigDecimal radius;

	public Circle(BigDecimal radius) {
		this.radius = radius;
	}

	@Override
	public BigDecimal calculateArea() {
		BigDecimal pi = new BigDecimal(Math.PI);
		return pi.multiply(getRadius().multiply(getRadius()));
	}

	private BigDecimal getRadius() {
		return this.radius;
	}

}
