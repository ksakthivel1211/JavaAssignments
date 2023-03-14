package primenumber;
import java.lang.Math;

public class Primenumber {
	static void palindrome(int p)
	{
		int old=p;
		int newVal=0;
		while(p>0)
		{	
			newVal=newVal*10;
			newVal=newVal+(p%10);
			p=p/10;
		}
		if(old==newVal)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
	static void armstrong(int a)
	{
		String str = String.valueOf(a);
		int l = str.length();
		
		int old=a;
		int newVal=0;
		while(a>0)
		{	
			newVal=(int) (newVal+(Math.pow((a%10),l)));
			a=a/10;
		}
		if(old==newVal)
		{
			System.out.println("The number is a armstrong");
		}
		else
		{
			System.out.println("The number is not a armstrong");
		}
	}
	
	static void perfect(int per)
	{
		int val=0;
		for(int i=1;i<per;i++)
		{
			if(per%i==0)
			{
				val=val+i;
			}
		}
		if(per==val)
		{
			System.out.println("The number is a perfect number");
		}
		else
		{
			System.out.println("The number is not a perfect number");
		}
		
	}

	public static void main(String[] args) {
		int a=6,count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count>0) {
			System.out.println(a+" "+"is not a prime number");
		}
		else {
			System.out.println(a+" "+"is a prime number");
		}
		palindrome(a);
		armstrong(a);
		perfect(a);
		
	}

}
