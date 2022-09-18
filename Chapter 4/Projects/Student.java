/*
4.7 Student Class: Nested if…else Statements
The example of Figs. 4.4–4.5 demonstrates a nested if…else statement that determines a student’s letter grade based on the student’s average in a course.

Class Student
Class Student (Fig. 4.4) has features similar to those of class Account (discussed in Chapter 3). Class Student stores a student’s name and average and provides methods for manipulating these values.
*/

// Fig. 4.4: Student.java 
// Student class that stores a student name and average. 

public class Student
{ 
	private String name; 
	private double average;  
	// constructor initializes instance variables 
	public Student(String name, double average)
	{ 
    	this.name = name; 
     	// validate that average is > 0.0 and <= 100.0; otherwise, 
     	// keep instance variable average's default value (0.0) 
		if (average > 0.0)
		{
			if (average <= 100.0)
			{
        		this.average = average; // assign to instance variable
        	}
     	}
	}
  	// sets the Student's name 
	public void setName(String name)
	{ 
    	this.name = name; 
  	}
  	// retrieves the Student's name 
	public String getName()
	{
    	return name; 
  	} 
  	// sets the Student's average
	public void setAverage(double studentAverage)
	{ 
    	// validate that average is > 0.0 and <= 100.0; otherwise, 
    	// keep instance variable average's current value  
		if (average > 0.0)
		{
			if (average <= 100.0)
			{
           		this.average = average; // assign to instance variable
        	}
     	}
  	} 
  	// retrieves the Student's average 
	public double getAverage()
	{ 
    	return average; 
  	} 
 	// determines and returns the Student's letter grade 
	public String getLetterGrade()
	{ 
    	String letterGrade = ""; // initialized to empty String 
		if (average >= 90.0)
		{
			letterGrade = "A";
		}
		else if (average >= 80.0)
		{
        	letterGrade = "B";
     	}
		else if (average >= 70.0)
		{
        	letterGrade = "C";
     	}
		else if (average >= 60.0)
		{
        	letterGrade = "D";
     	}
		else
		{
        	letterGrade = "F";
     	}
  		return letterGrade; 
  	} 
}