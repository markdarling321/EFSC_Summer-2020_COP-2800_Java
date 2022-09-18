public class Student extends Person
{
	private int graduation_year;
	private double gpa;

	public Student(String fname, String lname, int gyear, double gp)
	{
		super(fname, lname);
		this.graduation_year = gyear;
		this.gpa = gp;
	}

	public void MyPrint()
	{
		System.out.println("Student details: ");
		super.MyPrint();
		System.out.println("\t" + graduation_year);
		System.out.println("\t" + gpa);
	}
}