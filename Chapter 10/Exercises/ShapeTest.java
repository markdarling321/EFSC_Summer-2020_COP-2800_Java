////////////////////////////////////////////////////////////////////////////////
//
//  NAME:       MARK DARLING
//  DATE:       07/12/20
//  COURSE:     SUMMER 2020  --  COP 2800-70B "Intro to Java Programming"
//
////////////////////////////////////////////////////////////////////////////////

// EXERCISE 10.14  --  PROJECT: SHAPE HIERARCHY

/*
10.14 (Project: Shape Hierarchy)

Implement the Shape hierarchy shown in Fig. 9.3 . Each TwoDimensionalShape should
contain method getArea to calculate the area of the two-dimensional shape. Each
ThreeDimensionalShape should have methods getArea and getVolume to calculate the
surface area and volume, respectively, of the three-dimensional shape.

Create a program that uses an array of Shape references to objects of each concrete
class in the hierarchy. The program should print a text description of the object
to which each array element refers. Also, in the loop that processes all the shapes
in the array, determine whether each shape is a TwoDimensionalShape or a
ThreeDimensionalShape. If it’s a TwoDimensionalShape, display its area. If it’s
a ThreeDimensionalShape, display its area and volume.
*/

import java.util.ArrayList;

public class ShapeTest
{
	public static void main(String args[])
	{
		// DECLARE NEW SUPERCLASS OBJECT ARRAY
		ArrayList<Shape> shapeCollection = new ArrayList<>();

		// CREATE SHAPE OBJECTS AND ADD THEM TO OUR shapeCollection LIST AS WE CREATE THEM

		// DRILL DOWN THROUGH 2D SHAPE HIERARCHY TREE
		Circle c = new Circle(3.14);	// RADIUS = 3.14
		c.declare();
		System.out.printf("AREA OF CIRCLE: %f\n\n\n\n", c.getArea());
		shapeCollection.add(c);

		Triangle t = new Triangle(3.14);	// EQUILATERAL TRIANGLE w/BASE = 3.14
		t.declare();
		System.out.printf("AREA OF TRIANGLE: %f\n\n\n\n", t.getArea());
		shapeCollection.add(t);

		RightTriangle rT = new RightTriangle(3,4); // RIGHT TRIANGLE w/BASE = 3 and HEIGHT = 4
		rT.declare();
		System.out.printf("AREA OF RIGHT TRIANGLE: %f\n\n\n\n", rT.getArea());
		shapeCollection.add(rT);

		Triangle306090 rT306090 = new Triangle306090(7,14); // RIGHT TRIANGLE w/BASE = 7 and HEIGHT = 14
		rT306090.declare();
		System.out.printf("AREA OF RIGHT TRIANGLE 30-60-90: %f\n\n\n\n", rT306090.getArea());
		shapeCollection.add(rT306090);

		// DRILL DOWN THROUGH 3D SHAPE HIERARCHY TREE
		Sphere s = new Sphere(3.14);	// RADIUS = 3.14
		s.declare();
		System.out.printf("AREA OF SHAPE: %f\n", s.getArea());
		System.out.printf("VOLUME OF SHAPE: %f\n\n\n\n", s.getVolume());
		shapeCollection.add(s);

		Hemisphere hS = new Hemisphere(3.14);	// RADIUS = 3.14
		hS.declare();
		System.out.printf("AREA OF SHAPE: %f\n", hS.getArea());
		System.out.printf("VOLUME OF SHAPE: %f\n\n\n\n", hS.getVolume());
		shapeCollection.add(hS);

		// ITERATE THROUGH OUR LIST OF SHAPE OBJECTS
		//for (int i = 0; i < shapeCollection.size(); i++)		// NOT NEEDED WITH MODIFIED for() LOOP
		for (Shape shape : shapeCollection)
		{
			//Shape shape = shapeCollection.get(i);				// NOT NEEDED WITH MODIFIED for() LOOP
			if (shape instanceof Shape2D)
			{
				System.out.println("2D SHAPE!");
				// DOWNCAST Shape REFERENCE TO Shape2D REFERENCE
				Shape2D currentShape = (Shape2D) shape;

				currentShape.declare();
				System.out.printf("\tAREA: %f\n\n", currentShape.getArea());
			}
			else if(shape instanceof Shape3D)
			{
				System.out.println("3D SHAPE!");
				// DOWNCAST Shape REFERENCE TO Shape3D REFERENCE
				Shape3D currentShape = (Shape3D) shape;
				
				currentShape.declare();
				System.out.printf("\tAREA: %f\n", currentShape.getArea());
				System.out.printf("\tVOLUME: %f\n\n", currentShape.getVolume());
			}
		}
	}
}