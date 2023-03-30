package BridgePattern;

class Import implements Port{
	@Override
	public void transport() {
		System.out.println("item imported");
	}
}