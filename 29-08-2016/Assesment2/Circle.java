import static java.lang.Math.PI;
public class Circle extends Shape{
	protected double radius;

	public Circle(){
		radius=0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return PI * radius * radius;
	}
	public double getPerimeter(){
		return 2 * PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled="
				+ filled + "]";
	}
}