//test class for all the objects
class TestShape{
	public static void main(String[] ar){
		Circle c1=new Circle(10.0,"Red",true);
		Rectangle r1=new Rectangle(10,20.0,"Blue",false);
		//Square s1=new Square(10,"Green",true);
		Sqr s2=new Sqr(10,"Cyan",true);
		Shape s;
		s=r1;
		System.out.println("------------\nRectangle object data\n============");
		System.out.println("Area"+s.getArea()+"\nPerimeter::"+s.getPerimeter());
		System.out.println(s);
		
		s=c1;
		System.out.println("------------\nCircle object data\n============");
		System.out.println("Area"+s.getArea()+"\nPerimeter::"+s.getPerimeter());
		System.out.println(s);
		
		s=s2;
		System.out.println("------------\nSquare object data\n============");
		System.out.println("Area"+s.getArea()+"\nPerimeter::"+s.getPerimeter());
		System.out.println(s);
	}
}