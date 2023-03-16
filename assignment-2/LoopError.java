package assignment2;
import java.util.Scanner;
import java.io.IOException;

class MathException extends NumberFormatException{
	MathException()
	{
		System.out.println("Error: divided by zero or Negative number");
	}
}

public class LoopError {

	public static void main(String[] args) throws MathException{
		Scanner sc = new Scanner(System.in);
		String a=null,b=null;
		while(true) {
			try {
				
			System.out.println("Enter the numerator:");
			a= sc.next();
			
			if(a.startsWith("q") || a.startsWith("Q")) {
				break;
			}
			int c= Integer.parseInt(a);
			
			System.out.println("Enter the denominator:");
			b= sc.next();
			
			
			int d= Integer.parseInt(b);
			
				if(d==0)
				{
					throw new MathException();
					
				}
				else if(d<0 || c<0)
				{
					throw new MathException();
				}
				else
				{
					System.out.println(c/d);
				}
			}
			catch(MathException e) {}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}

	}
	}

