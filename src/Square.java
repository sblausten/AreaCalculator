
public class Square implements Shape{
	
	private Double length;
	private Double width;

	public Square(Double side) {
		this.length = side;
		this.width = side;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

}
