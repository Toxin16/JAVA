import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println("벡터 내의 요소 개체 수" + v.size());
		System.out.println("벡터 내의 현재 용량" + v.capacity());
	}

}
