package BridgePattern;

public class BridgePattern {

	public static void main(String[] args) {
		
		Products product = new FoodItems (new Import(), new Distribute());
		product.doWork();
		System.out.println("...");
		Products product2 = new ElectronicItems (new Import(), new Distribute());
		product2.doWork();
	}
	
}

interface Port{
	void transport();
}

