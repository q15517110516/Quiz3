public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	/**
	 * default values 1.0 to denote three sides of the triangle.
	 */
	public Triangle() {
		super();
		// the default method to set the all side 1.0
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	/**
	 * 
	 A constructor that creates a triangle with the specified side1, side2,
	 * and side3.
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * the method to get the Triangle's area
	 */
	@Override
	public double getArea() {
		// Verification it is a triangle or not
		if ((side1 + side2) < side3) {
			return -1;
		}
		double s = (side1 + side2 + side3) / 2.0;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/**
	 * the method to get the Triangle's Perimeter
	 */
	@Override
	public double getPerimeter() {
		// Verification it is a triangle or not
		if ((side1 + side2) < side3) {
			return -1;
		}
		return side1 + side2 + side3;
	}

	/**
	 * 
	 * @return side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * set side 1
	 * 
	 * @param side1
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

}
