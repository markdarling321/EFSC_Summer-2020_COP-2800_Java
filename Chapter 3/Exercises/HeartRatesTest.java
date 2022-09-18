import java.util.Scanner;

public class HeartRatesTest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		HeartRates person1 = new HeartRates();
		HeartRates person2 = new HeartRates();

		System.out.printf("ENTER PERSON 1's INFORMATION...\n");
		System.out.printf("FIRST NAME: \t");
		person1.setFirstName(input.next());
		System.out.printf("LAST NAME: \t");
		person1.setLastName(input.next());
		System.out.printf("BIRTH MONTH: \t");
		person1.setBirthMonth(input.nextInt());
		System.out.printf("BIRTH DAY: \t");
		person1.setBirthDay(input.nextInt());
		System.out.printf("BIRTH YEAR: \t");
		person1.setBirthYear(input.nextInt());

		System.out.printf("\n\n\n");

		System.out.printf("ENTER PERSON 2's INFORMATION...\n");
		System.out.printf("FIRST NAME: \t");
		person2.setFirstName(input.next());
		System.out.printf("LAST NAME: \t");
		person2.setLastName(input.next());
		System.out.printf("BIRTH MONTH: \t");
		person2.setBirthMonth(input.nextInt());
		System.out.printf("BIRTH DAY: \t");
		person2.setBirthDay(input.nextInt());
		System.out.printf("BIRTH YEAR: \t");
		person2.setBirthYear(input.nextInt());

		System.out.printf("\n\n\n");

		System.out.printf("\tFIRST NAME \t\t LAST NAME \t\t AGE \t\t MAX HEART RATE \t TARGET HEART RATE \n\n");
		System.out.printf("\t%-20s \t %-20s \t %-6d \t %-6d \t\t %-6.2f \n",
						  person1.getFirstName(),
						  person1.getLastName(),
						  person1.getAge(),
						  person1.getMaxHeartRate(),
						  person1.getTargetHeartRate()
		);
		System.out.printf("\t%-20s \t %-20s \t %-6d \t %-6d \t\t %-6.2f \n",
						  person2.getFirstName(),
						  person2.getLastName(),
						  person2.getAge(), 
						  person2.getMaxHeartRate(), 
						  person2.getTargetHeartRate()
		);

		System.out.printf("\n\n");
		input.close();
	}
}