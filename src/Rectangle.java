/**
 * This class implements a Rectangle shape. It extends from the Polygon class
 * and retains all it's methods.
 * 
 * @author Carter Clark
 *
 */
//this for class adapter, I need object adapter
public class Rectangle implements FilledShape {

	private Polygon polygon = new Polygon();

	private int red, green, blue;

	/**
	 * The paramters are opposite vertices of the rectangle. The constructor
	 * computes the other two vertices. If two points are the same it throws an
	 * exception
	 * 
	 * @param point1, of type Point
	 * @param point2, of type Point
	 * @throws Exception
	 */
	public Rectangle(Point point1, Point point2) throws Exception {
		if (point1.getX() == point2.getX() || point1.getY() == point2.getY()) {
			throw new Exception("Error: points aligned incorrectly for rectangle");
		}

		// assuming point 1 is bottom left corner or top right corner
		if ((point1.getX() < point2.getX() && point1.getY() > point2.getY())
				|| point1.getX() > point2.getX() && point1.getY() < point2.getY()) {
			polygon.addPoint(point1);
			polygon.addPoint(new Point(point1.getX(), point2.getY()));
			polygon.addPoint(point2);
			polygon.addPoint(new Point(point2.getX(), point1.getY()));
		}
		// assuming point 1 top left corner or bottom right
		else if ((point1.getX() < point2.getX() && point1.getY() < point2.getY())
				|| point1.getX() > point2.getX() && point1.getY() > point2.getY()) {
			polygon.addPoint(point1);
			polygon.addPoint(new Point(point2.getX(), point1.getY()));
			polygon.addPoint(point2);
			polygon.addPoint(new Point(point1.getX(), point2.getY()));
		}
		polygon.end();
	}

	@Override
	public void setColor(int red, int green, int blue) {
		if (red < 0 || 255 < red || green < 0 || 255 < green || blue < 0 || 255 < blue) {
			return;
		}
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	@Override
	public void display() {
		System.out.println("\nRectangle " + toString());
	}

	@Override
	public String toString() {
		String string = polygon.toString();

		string += " filled in (r = " + red + ", g = " + green + ", b = " + blue + ")";
		return string;
	}
}
