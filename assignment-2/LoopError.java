package assignment2;
import java.util.Scanner;
import java.io.IOException;
import java.math.*;

class MathException extends Exception{
	MathException()
	{
		System.out.println("Error: divided by zero");
	}
}

public class LoopError {

	public static void main(String[] args) throws MathException{
		Scanner sc = new Scanner(System.in);
		String a=null,b=null;
		while(true) {
			System.out.println("Enter the numerator:");
			a= sc.nextLine();
			if(a.startsWith("q") || a.startsWith("Q")) {
				break;
			}
			System.out.println("Enter the denominator:");
			b= sc.nextLine();
			
			try {
				int c= Integer.parseInt(a);
				int d= Integer.parseInt(b);
				
				
				if(d==0)
				{
					throw new MathException();
					
				}
				else
				{
					System.out.println(c/d);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}

	}

}
