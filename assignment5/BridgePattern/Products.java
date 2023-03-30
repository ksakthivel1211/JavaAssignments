package BridgePattern;

abstract class Products{
	Port importJob,distibuteJob;
	Products (Port importJob, Port distibuteJob) {
		this.importJob=importJob;
		this.distibuteJob=distibuteJob;
	}
	abstract void doWork();
}