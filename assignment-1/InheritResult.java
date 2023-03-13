package inheritResults;

public class InheritResult {

	public static void main(String[] args) {
		String name ="sakthi";
		int rollno = 26;
		results result = new results(12,13,14,name,rollno);
		result.calculate();
	}

}
class students{
	String name;
	int rollNo;
	students(String name,int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
}
class exam extends students{
	int mark1,mark2,mark3;
	exam(int mark1,int mark2,int mark3,String name,int rollNo)
	{
		super(name,rollNo);
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
}
class results extends exam{
	int total=0;
	results(int mark1,int mark2,int mark3,String name,int rollNo)
	{
		super(mark1,mark2,mark3,name,rollNo);
	}
	void calculate()
	{
		int result= mark1+mark2+mark3;
		System.out.println("Total marks is"+" "+result);
	}
}
