import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println("���� ���� ��� ��ü ��" + v.size());
		System.out.println("���� ���� ���� �뷮" + v.capacity());
	}

}
