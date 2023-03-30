package FlyWeight;

class Samsung implements Phone{
	private String color;
	@Override
	public void color(String color) {
		this.color = color;
	}
	@Override
	public void phoneFunction() {
		System.out.println("calling from Samsung phone with color: "+ color);
	}
}