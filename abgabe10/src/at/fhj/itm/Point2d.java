package at.fhj.itm;

public class Point2d {
	private boolean debug;
	protected double px;
	protected double py;
	
	public Point2d (double px, double py)
	{ 
		this.px = px;
		this.py = py;
	}

	public Point2d () 
	{		
		this(0.0, 0.0);
	}

	public Point2d (Point2d pt) 
	{
		this(pt.px, pt.py);
	}

	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	public void setDebug (boolean b) {
		debug = true;
	}

	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + px + " to " + px );
		this.px = px;
	}

	public double getX() {
		return px;
	}

	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + py + " to " + py );
		this.py = py;
	}

	public double getY() {
		return py;
	}

	public void setXY(double px, double py) {
		this.px = px;
		this.py = py;
	}

	public double distanceFrom (Point2d pt) {
		return Math.sqrt(Math.pow(px - pt.px, 2.0) + Math.pow(py - pt.py, 2.0));
	}

	public double distanceFromOrigin () {
		return distanceFrom(new Point2d());
	}

	public String toString() {
		return "Point2d [px=" + px + ", py=" + py + "]";
	}
	
}

