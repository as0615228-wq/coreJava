package _interface;

public class ShapeDraw {
	public static void main(String[]args) {
		Example cr=new Circle();
		Example rc=new Rectangle();
		Example tr=new Triangle();
		cr.draw();
		rc.draw();
		tr.draw();
	}

}
