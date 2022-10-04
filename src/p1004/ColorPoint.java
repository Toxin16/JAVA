package p1004;

public class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(this.color);
		showPoint();
	}
}
