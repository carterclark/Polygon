
public class Driver {

	public static void main(String[] args) throws Exception {

		Polygon polygon = new Polygon();
		polygon.addPoint(new Point(3, 4));
		polygon.addPoint(new Point(9, 8));
		polygon.addPoint(new Point(2, 7));
		polygon.addPoint(new Point(15, 6));
		polygon.end();
		polygon.display();
		assert (("Polygon toString " + polygon.toString())
				.equalsIgnoreCase("Polygon toString Vertices (3, 4) (9, 8) (2, 7) (15, 6) "));
		Rectangle rectangle = new Rectangle(new Point(1, 2), new Point(5, 8));

//		Rectangle rectangle1 = new Rectangle(new Point(1, 2), new Point(1, 2));

		rectangle.display();
		assert (rectangle.toString()
				.equalsIgnoreCase("Vertices (1, 2) (5, 2) (5, 8) (1, 8)  filled in (r = 0, g = 0, b = 0)"));
		Rectangle rectangle2 = new Rectangle(new Point(5, 8), new Point(1, 2));
		rectangle2.display();
		assert (rectangle2.toString()
				.equalsIgnoreCase("Vertices (5, 8) (1, 8) (1, 2) (5, 2)  filled in (r = 0, g = 0, b = 0)"));
		Rectangle rectangle3 = new Rectangle(new Point(1, 8), new Point(5, 2));
		rectangle3.display();
		rectangle3.setColor(100, 200, 150);
		rectangle3.setColor(256, 100, 100);
		rectangle3.setColor(100, 256, 100);
		rectangle3.setColor(120, 100, 256);
		rectangle3.setColor(-1, 100, 100);
		rectangle3.setColor(100, -1, 100);
		rectangle3.setColor(120, 100, -1);
		assert (rectangle3.toString()
				.equalsIgnoreCase("Vertices (1, 8) (1, 2) (5, 2) (5, 8)  filled in (r = 100, g = 200, b = 150)"));
		Rectangle rectangle4 = new Rectangle(new Point(5, 2), new Point(1, 8));
		rectangle4.display();
		assert (rectangle4.toString()
				.equalsIgnoreCase("Vertices (5, 2) (5, 8) (1, 8) (1, 2)  filled in (r = 0, g = 0, b = 0)"));

		try {
			Rectangle rectangle5 = new Rectangle(new Point(8, 19), new Point(8, 30));
			rectangle5.display();
		} catch (Exception e) {
			System.out.println("throws exception for rectangle");
		}

//		Square square = new Square(new Point(1, 2), new Point(5, 8));

		Square square1 = new Square(new Point(4, 5), new Point(8, 9));
		square1.display();
		assert (square1.toString()
				.equalsIgnoreCase("Vertices (4, 5) (8, 5) (8, 9) (4, 9)  filled in (r = 0, g = 0, b = 0)"));
		try {
			Square square2 = new Square(new Point(8, 19), new Point(10, 30));
			square2.display();
		} catch (Exception e) {
			System.out.println("throws exception for square");
		}

	}

}
