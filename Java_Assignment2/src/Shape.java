
public abstract class Shape {
	abstract void draw();

	public static void main(String[] args) {
		
		Shape L=new Line();
		L.draw();
		Shape R=new Rectangle();
		R.draw();
		Shape c=new Cube();
		c.draw();

	}

}
