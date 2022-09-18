public class TestInheritance
{
	public static void main(String[] args)
	{
		Student s1 = new Student("sam", "watson", 2012, 3.8);
		s1.MyPrint();
		Faculty f1 = new Faculty("Dave", "Smith", 35000.00);
		f1.MyPrint();
	}
}