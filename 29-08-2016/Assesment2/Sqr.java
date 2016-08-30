public class Sqr extends Shape{
	private double side;

	public Sqr(double side, String color, boolean filled) {
		super(color, filled);
		this.side=side;
	}

	public Sqr(double side) {
		this.side=side;
	}

	public Sqr(){
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
		return "Sqr [side=" + side + ", color=" + color + ", filled="
				+ filled + "]";
	}
}