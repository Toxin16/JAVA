package p1017;

abstract class OddDetector {
	protected int n;
	public OddDetector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd();	//추상메소드
}

public class Ex10 extends OddDetector {
	public Ex10(int n) {super(n);}
	public static void main(String[] args) {
		Ex10 b = new Ex10(10);
		System.out.println(b.isOdd());
	}
	@Override
	public boolean isOdd() {
		// TODO Auto-generated method stub
		return false;
	}
}
