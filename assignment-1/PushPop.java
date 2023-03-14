package stackPushPop;
import java.io.InputStream;
import java.util.*;
interface stack{
	public void push(int num);
	
	public void pop();
}
class fixedStack implements stack{
	int size;
	int count;
	int arr[];
	
	public fixedStack(int size)
	{
		this.size=size;
		arr = new int[size];
	}
	
	public void push(int num)
	{
		if(count+1>size)
		{
			System.out.println("unaku avlo daan limit uh!");
		}
		else
		{
			arr[count]=num;
			count++;
			System.out.println(num+" "+"ah postion"+" "+count+" "+"la push panniyaachu da");
		}
	}
	public void pop()
	{
		if(count<1)
		{
			System.out.println("onnume illa ulla, poi push pannu po!");
		}
		else {
			int temp=arr[--count];
//			count--;
			System.out.println(temp+" "+"ah pop panniyaachu");
		}
	}
}
	class dynamicStack implements stack{
		int top=0;
		int arr[] = new int[0];
		
		public void push(int num) {
			int[] copy = Arrays.copyOf(arr, ++top);
			arr = copy;
			arr[top-1]=num;
			System.out.println(num +" "+"ah position"+top+" "+"la push panniyaachu");
		}
		public void pop() {
			if(top==0) {
				System.out.println("stack empty ah iruku da");
			}
			else {
				int[] copy = Arrays.copyOf(arr, --top);
				arr = copy;
				System.out.println("poped");
			}
		}
	}
public class PushPop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=5;
		fixedStack obj = new fixedStack(a);
		dynamicStack obj1 = new dynamicStack();
		
		for(;;) {
			
			System.out.println("Fixed Stack\nEnter:\n1 for push\n2 for pop\n3 to exit");
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("Enter the number to be pushed");
				int push=sc.nextInt();
				obj.push(push);
			}
			else if(b==2) {
				obj.pop();
			}
			else if(b==3){
				break;
			}
			else {
				System.out.println("invalid input1");
			}
		}
		
		for(;;) {
			
			System.out.println("Dynamic Stack\nEnter:\n1 for push\n2 for pop\n3 to exit");
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("Enter the number to be pushed");
				int push=sc.nextInt();
				obj1.push(push);
			}
			else if(b==2) {
				obj1.pop();
			}
			else if(b==3){
				break;
			}
			else {
				System.out.println("invalid input1");
			}
		}
		

	}

}
