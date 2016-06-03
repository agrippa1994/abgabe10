package at.fhj.itm;

public class Point2d {
	private boolean debug;
	protected double px;
	protected double py;
	
	/**
	 * Creates a new Point from xy coordinates
	 * @param px Point x
	 * @param py Point y
	 */
	public Point2d (double px, double py)
	{ 
		this.px = px;
		this.py = py;
	}

	/**
	 * Creates a new Point at the origin
	 */
	public Point2d () 
	{		
		this(0.0, 0.0);
	}

	/**
	 * Creates a Point at the position of another Point
	 * @param pt Another Point
	 */
	public Point2d (Point2d pt) 
	{
		this(pt.px, pt.py);
	}

	/**
	 * Prints a debug message on the standard output if debug mode is enabled
	 * @param s String to print
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * Sets the debug mode
	 * @param b true if debug false if not
	 */
	public void setDebug (boolean b) {
		debug = true;
	}

	/**
	 * Sets the x position
	 * @param px x position
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + px + " to " + px );
		this.px = px;
	}

	/**
	 * Gets the x position
	 * @return x position
	 */
	public double getX() {
		return px;
	}

	/**
	 * Sets the y position
	 * @param py y position
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + py + " to " + py );
		this.py = py;
	}

	/**
	 * Gets the y position
	 * @return y position
	 */
	public double getY() {
		return py;
	}

	/**
	 * Sets the x and y position of the Point
	 * @param px x position
	 * @param py y position
	 */
	public void setXY(double px, double py) {
		this.px = px;
		this.py = py;
	}

	/**
	 * Calculates the distance from another Point
	 * @param pt Another Point
	 * @return the distance
	 */
	public double distanceFrom (Point2d pt) {
		return Math.sqrt(Math.pow(px - pt.px, 2.0) + Math.pow(py - pt.py, 2.0));
	}

	/**
	 * Calculates the distance from the origin
	 * @return the distance from the origin
	 */
	public double distanceFromOrigin () {
		return distanceFrom(new Point2d());
	}

	/**
	 * Prints the Point object as a String
	 */
	public String toString() {
		return "Point2d [px=" + px + ", py=" + py + "]";
	}
	
}

