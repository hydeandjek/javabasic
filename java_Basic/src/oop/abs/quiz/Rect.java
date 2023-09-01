package oop.abs.quiz;


public class Rect extends Shape{
	int v;
	Rect(String sName, int vn) {
		super(sName);
		v= vn;
	}

	@Override
	public double getArea() {
		return v*v;
	}

}
