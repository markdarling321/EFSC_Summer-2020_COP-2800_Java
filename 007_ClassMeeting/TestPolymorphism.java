public class TestPolymorphism
{
	public static void main(String[] args)
	{
		Person p[] = new Person[3];

		p[0] = new Student("Mark", "Smith", 2011, 3.9);
		p[1] = new Faculty("Dave", "Smith", 48000);
		p[2] = new Student("Bill", "Gangraw", 2015, 3.5);

		for (Person persons:p)
		{
			persons.MyPrint();
		}
	}
}