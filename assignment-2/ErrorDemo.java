package assignment2;

import java.io.IOException;

public class ErrorDemo {
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			throw new IOException();
//			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("catch-mth2");
		}
		finally
		{
			System.out.println("finally-mth2");
		}

	}
	public static void main(String args[])
	{
		ErrorDemo obj = new ErrorDemo();
		obj.mth1();
	}
}
