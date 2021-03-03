/**
 * This interface extends the shape interface and can be filled with a color the
 * user chooses. This interface has the additional method named setColor() with
 * 3 parameters: red, green, and blue, all of type int and can have values
 * between 0 and 255 (both end values included) to represent the color of the
 * shape. The implementing class is will validate the values of the parameters
 * before setting the color.
 * 
 * @author Carter Clark
 *
 */
public interface FilledShape extends Shape {
	/**
	 * This method sets the fill color for a given shape. The colors can have values
	 * between 0 and 255.
	 * 
	 * @param red,   of type int
	 * @param green, of type int
	 * @param blue,  of type int
	 */
	public void setColor(int red, int green, int blue);
}
