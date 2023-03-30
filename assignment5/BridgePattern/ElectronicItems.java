package BridgePattern;

class ElectronicItems extends Products {
	public ElectronicItems (Port importJob, Port distibuteJob) { 
		super(importJob, distibuteJob);
	}

	@Override
	void doWork() {
		System.out.println("Electronic Items");
		importJob.transport(); 
		distibuteJob.transport();
	}
}