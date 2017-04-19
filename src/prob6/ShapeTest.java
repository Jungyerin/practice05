package prob6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {

		Shape rect = new Rectangle();
		Shape rectt = new RectTriangle();
		List<Shape> list = new ArrayList<Shape>();

		rect.setWidth(5);
		rect.setHeight(6);

		rectt.setWidth(6);
		rectt.setHeight(2);

		list.add(rect);
		list.add(rectt);

		Iterator<Shape> it = list.iterator();
		while (it.hasNext()) {
			Shape s = it.next();
			System.out.println("area : " + s.getArea() + "\n" + "Perimeter : " + s.getPerimeter());
			if (s instanceof Resizable) {
				((Resizable) s).resize(0.5);
				System.out.println("new area : " + s.getArea() + "\n" + "new Perimeter : " + s.getPerimeter());
			} else {
				continue;
			}
		}

	}

}
