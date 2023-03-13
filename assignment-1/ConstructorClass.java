package constructorClasses;

public class ConstructorClass {

	public static void main(String[] args) {
		C obj = new C();
	}

}
class A
{
	A()
	{
		System.out.println("this is a");
	}
}
class B
{
	B()
	{
		System.out.println("this is b");
	}
}
class C extends A
{
	B obj = new B();
}