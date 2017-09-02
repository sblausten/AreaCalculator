import java.math.BigDecimal;

public class Rectangle implements Shape{

	private BigDecimal length;
	private BigDecimal width;

	public Rectangle(BigDecimal length, BigDecimal width) {
		this.length = length;
		this.width = width;
	}
	
	public BigDecimal calculateArea() {
		return getLength().multiply(getWidth());
	}
	
	public void setWidth(BigDecimal width) {
		this.width = width;
	}
	
	public void setLength(BigDecimal length) {
		this.length = length;
	}

	private BigDecimal getLength() {
		return length;
	}

	private BigDecimal getWidth() {
		return width;
	}



}
