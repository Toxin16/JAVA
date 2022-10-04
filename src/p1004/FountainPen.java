package p1004;

public class FountainPen extends Pen{
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void refill(int n) {
		amount = n;
	}
}
