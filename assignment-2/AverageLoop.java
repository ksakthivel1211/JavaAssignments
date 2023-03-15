package assignment2;
import java.io.IOException;
import java.util.Scanner;

class RangeException extends Exception{
	RangeException()
	{
		System.out.println("Error: Value out of range");
	}
}

public class AverageLoop {
	static int arr[] = new int[10];
	static int index =0;
	static int total = 0;
	public static void calculate(int index) throws Exception{
		Scanner sc = new Scanner(System.in);
		for(int i=index; i<arr.length;i++)
		{
			try {
				System.out.println("Enter student"+" "+(i+1)+" "+"marks:");
				arr[i]= sc.nextInt();
				if(arr[i]<0 || arr[i]>100) {
					throw new RangeException();
				}
				else {
					total = total +arr[i];
					index++;
				}

			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Enter proper input");
				calculate(index);
			}

		}
	}
	public static void main(String[] args) throws Exception {
		calculate(index);
		System.out.println("Average of students mark is:"+" "+(total/arr.length));

	}

}
