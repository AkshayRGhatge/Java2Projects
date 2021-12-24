package sheridan;

public class CicleTester {

	public static void main(String[] args){
		Shape[] shape=new Shape[2];
		shape[0]=new Circle("Black", 10.5);
		shape[1]=new Rectangle("Red", 10, 20);

		for(Shape Shape : shape){
		System.out.println("Area: " +Shape.getArea() +" sq Meter");
		System.out.println("Color: " +Shape.getColor());
		System.out.println("Perimeter: " +Shape.getPerimeter() +" Meter");
		}
		}
}
