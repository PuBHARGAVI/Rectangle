package RectangleTest;
import static org.junit.Assert.*;
import org.junit.Test;
import Rectangle.Rectangle;
public class RectangleTest {
	@Test
	public void testAreaIsPositiveForPositiveSideValues() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(20,rectanglearea.computeArea(4,5));
	}
	@Test
	public void testAreaIsZeroForBothSideValuesZero() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(0,rectanglearea.computeArea(0,0));
	}
	@Test
	public void testAreaIsZeroForOneSideValueZero() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(0,rectanglearea.computeArea(0,3));
		assertEquals(0,rectanglearea.computeArea(3,0));
	}
	@Test
	public void testAreaIsMinusOneForNegativeSideValues() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(-1,rectanglearea.computeArea(-4,-5));
		assertEquals(-1,rectanglearea.computeArea(-4,5));
		assertEquals(-1,rectanglearea.computeArea(4,-5));
	}
	@Test
	public void testPerimeterIsPositiveForPositiveSideValues() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(18,rectanglearea.computePerimeter(4,5));
	}
	@Test
	public void testPerimeterIsZeroForBothZeroSideValues() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(0,rectanglearea.computePerimeter(0,0));
	}
	@Test
	public void testPerimeterIsNotZeroForOneSideValueZero() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(6,rectanglearea.computePerimeter(0,3));
		assertEquals(6,rectanglearea.computePerimeter(3,0));
	}
	@Test
	public void testPerimeterIsMinusOneForNegativeSideValues() {
		Rectangle rectanglearea=new Rectangle();
		assertEquals(-1,rectanglearea.computePerimeter(-4,-5));
		assertEquals(-1,rectanglearea.computePerimeter(-4,5));
		assertEquals(-1,rectanglearea.computePerimeter(4,-5));
	}

}
