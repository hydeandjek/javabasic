package oop.abs.quiz;


public class Rect extends Shape{
	private int v;
	private int width;
	private int height;
	public Rect(String name, int v) {
		super(name);
		this.v= v;
	}

	public Rect(String name, int width,int height) {
		super(name);
		this.width=width;
		this.height=height;
	}
	@Override
	public double getArea() {
		if(v != 0) {
			return v*v;
		}else {
			return width*height;
		}
	}
	public int getV() {
		return v;
	}
	private void setV(int v) {
		this.v = v;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
