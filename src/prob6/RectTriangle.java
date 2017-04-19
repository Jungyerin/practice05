package prob6;

public class RectTriangle extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getHeight() * super.getWidth() * 0.5;

	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return super.getHeight() + super.getWidth()
				+ Math.sqrt((Math.pow(super.getHeight(), 2) + Math.pow(super.getWidth(), 2)));
	}

}
