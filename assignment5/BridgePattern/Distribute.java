package BridgePattern;

class Distribute implements Port{
	@Override
	public void transport() {
		System.out.println("item distributed");
	}
}

