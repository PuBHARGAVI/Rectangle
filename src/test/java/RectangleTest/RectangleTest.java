package RectangleTest;

import static org.junit.Assert.*;
import org.junit.Test;
import Rectangle.Rectangle;

public class RectangleTest {
	@Test
	public void testAreaIsPositiveForPositiveSideValues() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(20, rectangle.area(4, 5));
	}

	@Test
	public void testAreaIsZeroForBothSideValuesZero() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(0, rectangle.area(0, 0));
	}

	@Test
	public void testAreaIsZeroForOneSideValueZero() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(0, rectangle.area(0, 4));
		assertEquals(0, rectangle.area(3, 0));
	}

	@Test
	public void testAreaIsMinusOneForNegativeSideValues() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(-1, rectangle.area(-4, -5));
		assertEquals(-1, rectangle.area(-4, 5));
		assertEquals(-1, rectangle.area(4, -5));
	}

	@Test
	public void testPerimeterIsPositiveForPositiveSideValues() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(18, rectangle.perimeter(4, 5));
	}

	@Test
	public void testPerimeterIsZeroForBothSideValuesZero() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(0, rectangle.perimeter(0, 0));
	}

	@Test
	public void testPerimeterIsNotZeroForOneSideValueZero() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(6, rectangle.perimeter(0, 3));
		assertEquals(6, rectangle.perimeter(3, 0));
	}

	@Test
	public void testPerimeterIsMinusOneForNegativeSideValues() {
		Rectangle rectangle = new Rectangle();
		
		assertEquals(-1, rectangle.perimeter(-4, -5));
		assertEquals(-1, rectangle.perimeter(-4, 5));
		assertEquals(-1, rectangle.perimeter(4, -5));
	}
}