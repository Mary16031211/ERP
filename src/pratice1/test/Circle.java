package pratice1.test;

public class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("This is a Circle.");
	}
	private int r;
	public Circle(int r){
		this.r=r;
	}
	public void zhouchang(){
		System.out.println("2*pi*r:"+(2*Math.PI*r));
	}
}
