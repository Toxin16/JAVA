package p1004;

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.showPoint();
		
		p.set(100, 100);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(50, -50);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
