public class Square extends Rectangle{
	private double side;

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		this.side=side;
	}

	public Square(double side) {
		super(side,side);
		this.side=side;
	}

	public Square(){
		side=0;
	}
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public  double getArea(){
		return side * side;
	}
	public  double getPerimeter(){
		return 4 * side;
	}

	public String toString() {
		return "Square [side=" + side + ", color=" + color + ", filled="
				+ filled + "]";
	}
	
}