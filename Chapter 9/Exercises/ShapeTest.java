public class ShapeTest
{
	public static void main(String args[])
	{
		// DECLARE NEW SUPERCLASS OBJECT
		Shape s = new Shape();
		s.declare();

		// DECLARE NEW 2D SHAPE SUBCLASS OBJECT
		s = new Shape2D();
		s.declare();

		// DRILL DOWN THROUGH 2D SHAPE HIERARCHY TREE
		s = new Polygon();
		s.declare();

		s = new Triangle();
		s.declare();

		s = new RightTriangle();
		s.declare();

		s = new Triangle306090();
		s.declare();

		s = new Quadrilateral();
		s.declare();

		s = new Parallelogram();
		s.declare();

		s = new Rhombus();
		s.declare();

		s = new Square();
		s.declare();

		// DECLARE NEW 3D SHAPE SUBCLASS OBJECT
		s = new Shape3D();
		s.declare();

		// DRILL DOWN THROUGH 3D SHAPE HIERARCHY TREE
		s = new Prism();
		s.declare();

		s = new RectangularPrism();
		s.declare();

		s = new Cube();
		s.declare();
	}	
}