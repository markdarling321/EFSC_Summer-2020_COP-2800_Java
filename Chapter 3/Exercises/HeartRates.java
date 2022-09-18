////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       06/25/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 3.16  --  TARGET HEART RATE CALCULATOR

/* DESCRIPTION:

3.16 (Target-Heart-Rate Calculator)

While exercising, you can use a heart-rate monitor to see that your heart rate
stays within a safe range suggested by your trainers and doctors. According to
the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the
formula for calculating your maximum heart rate in beats per minute is 220 minus
your age in years. Your target heart rate is a range that’s 50–85% of your
maximum heart rate. [Note: These formulas are estimates provided by the AHA.
Maximum and target heart rates may vary based on the health, fitness and gender
of the individual. Always consult a physician or qualified health-care
professional before beginning or modifying an exercise program.]

Create a class called HeartRates. The class attributes should include the
person’s first name, last name and date of birth (consisting of separate
attributes for the month, day and year of birth). Your class should have a
constructor that receives this data as parameters. For each attribute provide
set and get methods. The class also should include a method that calculates and
returns the person’s age (in years), a method that calculates and returns the
person’s maximum heart rate and a method that calculates and returns the
person’s target heart rate. Write a Java app that prompts for the person’s
information, instantiates an object of class HeartRates and prints the
information from that object—including the person’s first name, last name and
date of birth—then calculates and prints the person’s age in (years), maximum
heart rate and target-heart-rate range.

*/

import java.time.*;

public class HeartRates
{
	// DECLARE ATTRIBUTES / INSTANCE VARIABLES
	private String fName;
	private String lName;
	private int bDay;
	private int bMonth;
	private int bYear;

	// CONSTRUCTOR WITH NO PARAMETERS
	public HeartRates()
	{
		// INITIALIZE ATTRIBUTES / INSTANCE VARIABLES
		fName = "";
		lName = "";
		bDay = 0;
		bMonth = 0;
		bYear = 0;
	}

	// CONSTRUCTOR WITH 3 PARAMETERS
	public HeartRates(String fName, String lName, int bDay, int bMonth, int bYear)
	{
		// INITIALIZE ATTRIBUTES / INSTANCE VARIABLES USING PASSED PARAMETERS
		this.fName = fName;
		this.lName = lName;
		this.bDay = bDay;
		this.bMonth = bMonth;
		this.bYear = bYear;
	}

	// SET FUNCTIONS
	public void setFirstName(String fName)
	{
		this.fName = fName;
	}

	public void setLastName(String lName)
	{
		this.lName = lName;
	}

	public void setBirthDay(int bDay)
	{
		if (bDay >= 1 && bDay <= 31)	// THIS IS NOT 100% CORRECT, JUST A ROUGH CHECK
			this.bDay = bDay;
		else
			System.out.println("ERROR!  --  INVALID INPUT");
	}

	public void setBirthMonth(int bMonth)
	{
		if (bMonth >= 1 && bMonth <= 12)
			this.bMonth = bMonth;
		else
			System.out.println("ERROR!  --  INVALID INPUT");
	}

	public void setBirthYear(int bYear)
	{
		if (bYear >= 1900 && bYear <= 2020)
			this.bYear = bYear;
		else
			System.out.println("ERROR!  --  INVALID INPUT");
	}

	// GET FUNCTIONS
	public String getFirstName()
	{
		return fName;
	}

	public String getLastName()
	{
		return lName;
	}

	public int getBirthDay()
	{
		return bDay;
	}

	public int getBirthMonth()
	{
		return bMonth;
	}

	public int getBirthYear()
	{
		return bYear;
	}

	public int getAge()
	{
		// GET CURRENT DAY / MONTH / YEAR TO HELP DETERMINE AGE
		LocalDateTime dateTime = LocalDateTime.now();
		int currentDay = dateTime.getDayOfMonth();
		int currentMonth = dateTime.getMonthValue();
		int currentYear = dateTime.getYear();

		// DEBUG  --  PRINT THE DAY / MONTH / YEAR TO VERIFY WHAT WE STORED IN VARIABLES ABOVE
		// System.out.printf("MONTH: %d \n", month);
		// System.out.printf("DAY: %d \n", day);
		// System.out.printf("YEAR: %d \n", year);

		// DETERMINE AGE
		int age;
		age = currentYear - bYear;

		if (currentMonth < bMonth)
			age -= 1;
		else if (currentMonth == bMonth && currentDay < bDay)
			age -= 1;

		return age;
	}

	public int getMaxHeartRate()
	{
		int maxHR = 220 - getAge();
		return maxHR;
	}

	public double getTargetHeartRate()
	{
		// RECOMMENDED TARGET HR = 50-85% OF MAX HR
		// 67.5% IS THE AVERAGE OF THE RECOMMENDED TARGET HR RANGE
		double targetHR = (getMaxHeartRate() * 0.675);
		return targetHR;
	}
}