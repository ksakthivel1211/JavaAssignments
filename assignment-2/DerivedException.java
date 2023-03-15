package assignment2;


class parent{
	parent() {
		int a=2,b=0;
		int c =a/b;
	}
}

class child extends parent{
	child() throws Exception{
		System.out.println("Arithmetic Exception");
	}
}

public class DerivedException {
	public static void main(String[] args) throws Exception{
		parent p = new child();
	}

}
 