package FlyWeight;

class Iphone implements Phone{
	private String color;
	@Override
	public void color(String color) {
		this.color = color;
	}
	@Override
	public void phoneFunction() {
		System.out.println("calling from iphone phone with color: "+ color);
	}
}