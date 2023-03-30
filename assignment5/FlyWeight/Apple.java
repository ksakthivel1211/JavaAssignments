package FlyWeight;

class Apple implements Phone{
	private String color;
	@Override
	public void color(String color) {
		this.color = color;
	}
	@Override
	public void phoneFunction() {
		System.out.println("calling from Apple phone with color: "+ color);
	}
}