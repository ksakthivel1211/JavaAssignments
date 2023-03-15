package assignment2;



public class NoCatch {
	static void validat(int speed)throws MyException{
		if(speed>100)
		{
			throw new MyException();
		}
		else
		{
			System.out.println("Correct speed");
		}
	}
	

	public static void main(String[] args) throws MyException {
		NoCatch obj = new NoCatch();
		obj.validat(101);
	}

}
