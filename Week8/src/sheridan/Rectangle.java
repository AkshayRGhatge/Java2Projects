package sheridan;

public class Rectangle extends Shape {
	private int width;
	private int height;
	public Rectangle(String color,int width,int height)
	{
		super(color);
		this.width=width;
		this.height=height;
	}
	public double getArea()
	{
		return width * height;
	}
	public double getPerimeter()
	{
		return 2 * width + 2 * height;
	}
}
