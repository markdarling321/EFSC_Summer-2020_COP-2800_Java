// Fig. 7.15: GradeBookTest.java
// GradeBookTest creates a GradeBook object using an array of grades,
// then invokes method processGrades to analyze them.

public class GradeBook1Test
{

	public static void main(String[] args)
	{
		// array of student grades
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

		GradeBook1 myGradeBook = new GradeBook1("CS101 Introduction to Java Programming", 
											   gradesArray
		);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n",
						   myGradeBook.getCourseName()
		);
		
		myGradeBook.processGrades();
	}
}