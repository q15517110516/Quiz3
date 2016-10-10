import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
	/**
	 * test getArea
	 */
	@Test
	public void testArea1() {
		Triangle triangle = new Triangle(3, 4, 5);
		double area = triangle.getArea();
		Assert.assertEquals(6.0, area, 0.0001);
	}

	/**
	 * test getArea
	 */
	@Test
	public void testArea2() {
		Triangle triangle = new Triangle();
		double area = triangle.getArea();
		Assert.assertEquals(0.4330, area, 0.0001);
	}

	/**
	 * test getPerimeter
	 */
	@Test
	public void testPerimeter1() {

		Triangle triangle = new Triangle(3, 4, 5);
		Assert.assertEquals(12.0, triangle.getPerimeter(), 0.0001);
	}

	/**
	 * test getPerimeter
	 */
	@Test
	public void testPerimeter2() {

		Triangle triangle = new Triangle();
		Assert.assertEquals(3.0, triangle.getPerimeter(), 0.0001);
	}

}
