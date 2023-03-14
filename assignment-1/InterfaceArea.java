package interfacearea;

public class InterfaceArea {

	public static void main(String[] args) {
		int side=6;
		Square objSqu = new Square(side);
		System.out.println("Area of square:"+objSqu.area());
		System.out.println("Perimeter of square:"+objSqu.perimeter());
		
		int radius=11;
		Circle objcir = new Circle(radius);
		System.out.println("Area of circle:"+objcir.area());
		System.out.println("Perimeter of circle:"+objcir.perimeter());
		
		int height=11,base=10,width=9;
		Triangle objtri = new Triangle(height,base,width);
		System.out.println("Area of triangle:"+objtri.area());
		System.out.println("Perimeter of triangle:"+objtri.perimeter());
		
		side=6;
		Cuboid objcub = new Cuboid(side);
		System.out.println("Area of cuboid:"+objcub.area());
		System.out.println("Volume of cuboid:"+objcub.volume());
		
		radius=6;
		Sphere objspe = new Sphere(radius);
		System.out.println("Area of sphere:"+objspe.area());
		System.out.println("volume of sphere:"+objspe.volume());
	}

}
interface calcArea{
	double area();
	double perimeter();
}

interface calcVolume{
	double surfaceArea();
	double volume();
}

class Square implements calcArea{
	
	int side;
	
	private Square() {}
	
	public Square(int side) {
		this.side = side;
	}
	
	public double area() {
		return side * side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
	
}

class Circle implements calcArea{
	
	int radius;
	
	private Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double perimeter() {
		return (Math.PI * 2 * radius);
	}
}

class Triangle implements calcArea{
	int height,base,width,area;
	
	private Triangle() {}
	
	public Triangle(int height,int base,int width) {
		this.height = height;
		this.base = base;
		this.width = width;
	}
	
	public double area() {
		area = (height+base+width)/2;
		return (Math.sqrt(area * (area - height) * (area - base) * (area - width)));
	}
	
	public double perimeter() {
		return (height + base + width);
	}
	
}

class Sphere implements calcArea,calcVolume{
	
	int radius;
	
	private Sphere() {};
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return (Math.PI * 2 * radius);
	}
	
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double surfaceArea() {
		return (Math.PI * 4 * radius * radius);
	}
	
	public double volume() {
		return (Math.PI * 4 * Math.pow(radius, 3)/3);
	}
	
}

class Cuboid implements calcArea,calcVolume{
	
	int side;
	
	private Cuboid() {}
	
	public Cuboid(int side) {
		this.side = side;
	}
	
	public double perimeter() {
		return 4 * side;
	}
	
	public double area() {
		return side * side;
	}
	
	public double surfaceArea() {
		return (6 * side * side);
	}
	
	public double volume() {
		return (side * side * side);
	}
	
}