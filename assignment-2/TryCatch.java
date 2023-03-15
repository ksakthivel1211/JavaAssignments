package assignment2;
class MyException extends Exception{
	MyException()
	{
		System.out.println("high speed");
	}
}
public class TryCatch {
	
	static void validate(int speed)throws MyException
	{
		if(speed>100)
		{
			throw new MyException();
		}
		else
		{
			System.out.println("Correct speed");
		}
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try 
		{
			validate(10);
			validate(101);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
