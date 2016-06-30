package at.fhj.itm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import at.fhj.itm.Point2d;

public class PointTest {
	
	Point2d pt1, pt2;
	
	@Before
	public void setup() {
		pt1 = new Point2d ();
		pt2 = new Point2d(4.0, 3.0);
	}
	
	@Test
	public void testDistanceFrom() {	
		assertEquals(pt1.distanceFrom(pt2), 5.0, 0.1);
		assertEquals(pt2.distanceFrom(pt1), 5.0, 0.1);
	}
	
	@Test
	public void testDistanceFromOrigin() {
		assertEquals(pt1.distanceFromOrigin(), 0, 0.1);
		assertEquals(pt2.distanceFromOrigin(), 5.0, 0.1);
	}
	
	@Test
	public void testSettersGetters() {
		Point2d pt = new Point2d();
		
		pt.setX(5);
		pt.setY(10);
		
		assertEquals(pt.getX(), 5.0, 0.1);
		assertEquals(pt.getY(), 10.0, 0.1);
		
		pt.setXY(20, 20);
		
		assertEquals(pt.getX(), 20.0, 0.1);
		assertEquals(pt.getY(), 20.0, 0.1);
	}
}