package oop.abs.quiz;

public class Circle extends Shape{
	private int r;
	Circle(String name, int r) {
		super(name);
		this.r = r;
		
	}

	@Override
	public double getArea() {
		return r*r*Math.PI;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
}
