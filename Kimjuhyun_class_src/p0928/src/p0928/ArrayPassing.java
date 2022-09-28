package p0928;

public class ArrayPassing {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};	//int[] a = {1, 2, 3, 4, 5}
		//배열 이름에는 배열의 시작 주소가 있음 
		//배열도 heap에 만들어짐
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