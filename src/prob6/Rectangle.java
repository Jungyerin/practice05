package prob6;

public class Rectangle extends Shape implements Resizable {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub

		return super.getHeight() * super.getWidth();

	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (super.getHeight() + super.getWidth()) * 2;

	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		super.setHeight(super.getHeight() * s);
		super.setWidth(super.getWidth() * s);

	}

}
