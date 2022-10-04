package p1004;
//p253
//부모 클래스
public class Point {
	public int x, y;
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}