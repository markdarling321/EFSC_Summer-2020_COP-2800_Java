// Fig. 8.9: EmployeeTest.java
// Composition demonstration.

public class Employee1Test
{
	public static void main(String[] args)
	{
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee1 employee = new Employee1("Bob", "Blue", birth, hire);

		System.out.println(employee);
	}
}