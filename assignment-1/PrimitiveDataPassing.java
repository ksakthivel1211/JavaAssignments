package primitiveDataPassing;

class food{
	int item;
}

public class PrimitiveDataPassing {
	static void primitiveValue(double db) {
		db=15.4;
	}
	
	static void arrayValue(int[] arr) {
		arr[0]=10;
	}
	
	static void objectValue(food obj) {
		obj.item=5;
	}

	public static void main(String[] args) {
		double db=10.1;
		primitiveValue(db);
		System.out.println(db);
		
		int[] a= {20,30,40};
		arrayValue(a);
		System.out.println(a[0]);
		
		food val = new food();
		objectValue(val);
		System.out.println(val.item);
		val.item=19;
		System.out.println(val.item);

	}

}
