package MomentoPattern;

public class MomentoPattern {

	public static void main(String[] args)throws Exception {
		CheckPoint check = new CheckPoint();
		
		System.out.println("Apples in level 1:"+check.apple);
		
		check.apple = 1;
		System.out.println("Apples in level 2:"+check.apple);
		new Write().writing(check);
		
		check.apple=10;
		System.out.println("Apples before checkpoint:"+check.apple);
		
		System.out.println("Going back to previous apples count");
		check = new Read().reading("/Users/sakthivel/Desktop/src/MomentoPattern/Checkpoint.dat");
		System.out.println(check.apple);
	}
}



