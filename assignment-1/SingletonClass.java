package singleton;

public class SingletonClass {

	public static void main(String[] args) {
		Singleton a = Singleton.singleton();
		System.out.println(a.s);

	}
}
class Singleton{
	private static Singleton value = null;
	 String s;
	
	private Singleton()
	{
		s="sakthi";
	}
	
	public static Singleton singleton()
	{
		if(value==null) {
			value = new Singleton();
		}
		return value;
	}
}
