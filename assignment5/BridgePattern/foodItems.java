package BridgePattern;

class FoodItems extends Products{
	public FoodItems (Port importJob, Port distibuteJob) {
		super(importJob, distibuteJob);
	}

	@Override
	void doWork() {
		System.out.println("Food Items");
		importJob.transport(); 
		distibuteJob.transport();
	}
}
