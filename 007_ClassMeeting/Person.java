public class Person
{
	private String firstName;
	private String lastName;

	public Person(String fname, String lname)
	{
		this.firstName = fname;
		this.lastName = lname;
	}

	public void MyPrint()
	{
		System.out.println("\t" + firstName + " " + lastName);
	}
	
}