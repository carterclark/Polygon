/**
 * This class implements a Square shape. It extends from the Rectangle class and
 * possesses all it's methods.
 * 
 * @author Carter Clark
 *
 */
public class Square extends Rectangle implements FilledShape {

	/**
	 * The paramters are opposite vertices of the square. The constructor computes
	 * the other two vertices. If either point is the same or not consistent with a
	 * square it throws an exception.
	 * 
	 * @param point1, of type Point
	 * @param point2, of type Point
	 * @throws Exception
	 */
	public Square(Point point1, Point point2) throws Exception {
		super(point1, point2);
		if ((point2.getX() - point1.getX()) != (point2.getY() - point1.getY())) {
			throw new Exception("Error: points aligned incorrectly for square");
		}

	}

	@Override
	public void display() {
		System.out.println("\nSquare " + super.toString());

	}

	@Override
	public void setColor(int red, int green, int blue) {
		super.setColor(red, green, blue);
	}

}
