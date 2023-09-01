package oop.abs.quiz;

public class Circle extends Shape{
	int r;
	Circle(String sName, int rn) {
		super(sName);
		r = rn;
		
	}

	@Override
	public double getArea() {
		return r*r*Math.PI;
	}

}
