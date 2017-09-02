import java.math.BigDecimal;

public class Square implements Shape{
	
	private BigDecimal side;

	public Square(BigDecimal side) {
		this.side = side;
	}

	@Override
	public BigDecimal calculateArea() {
		return getSide().multiply(getSide());
	}
	
	public void setSide(BigDecimal side) {
		this.side = side;
	}

	private BigDecimal getSide() {
		return this.side;
	}

}
