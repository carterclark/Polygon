/**
 * This class implements a Polygon shape. The vertices are stored in an array of
 * Point objects. Vertices are added using the add() method. After all vertices
 * are added, the user is expected to call the end() method, which duplicates
 * the first vertex and stores it as the last vertex. This makes it a bit easier
 * to display the Polygon in a graphical interface. (The current implementation
 * only displays the vertices on the console.)
 * 
 * @author Carter Clark
 * 
 *         Adapted code from:
 * @author Brahma Dathan
 * @Copyright (c) 2018
 *
 */

public class Polygon implements Shape {

	private Point[] points;
	private int numberOfPoints;

	/**
	 * Creates the array to hold at most 10 Point objects. The addPoint() method
	 * expands the size as needed.
	 */
	public Polygon() {
		points = new Point[10];
	}

	/**
	 * Adds one more vertex to the polygon
	 * 
	 * @param point
	 */
	public void addPoint(Point point) {
		if (this.points.length == numberOfPoints + 1) {
			Point[] temp = new Point[numberOfPoints * 2];
			System.arraycopy(points, 0, temp, 0, numberOfPoints);
			points = temp;
		}
		points[numberOfPoints++] = point;
		points[numberOfPoints] = point;
	}

	/**
	 * Adds the first vertex as the last vertex, so the drawing (if we are drawing)
	 * would be complete.
	 */
	public void end() {
		points[numberOfPoints] = points[0];
	}

	@Override
	public void display() {
		System.out.println("\nPolygon " + toString());
	}

	@Override
	public String toString() {
		String string = "Vertices ";
		for (int index = 0; index < numberOfPoints; index++) {
			string += "(" + points[index].getX() + ", " + points[index].getY() + ") ";
		}
		return string;
	}
}
