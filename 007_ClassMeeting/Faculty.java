public class Faculty extends Person
{
	private double salary;
	
	public Faculty(String fname, String lname, double sal)
	{
		super(fname, lname);
		this.salary = sal;
	}

	public void MyPrint()
	{
		System.out.println("Faculty details: ");
		super.MyPrint();
		System.out.println("\t" + salary);
	}
}