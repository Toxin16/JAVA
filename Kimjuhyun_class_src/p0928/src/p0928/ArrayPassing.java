package p0928;

public class ArrayPassing {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};	//int[] a = {1, 2, 3, 4, 5}
		//�迭 �̸����� �迭�� ���� �ּҰ� ���� 
		//�迭�� heap�� �������
		increase(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	static void increase(int[] b) {
		for (int i = 0; i < b.length; i++) {
			b[i]++;
		}
	}
}