package p1005;

public class PrimitiveTypeCast {
	public static void main(String[] args) {
		//byte - short - char - int - long - float - double
		//boolean�� �ٸ� Ÿ�԰� ����ȯ�� �ȵ�.
		//create int type variable
		int num = 10;
		System.out.println("The integer value : " + num);
		//convert into double type
		//�ڵ� ����ȯ(casting) ������
		double data = num;
		System.out.println("The double value : " + data);
		
		 // create double type variable
	    double numdb = 10.99;
	    System.out.println("The double value: " + numdb);
	    // convert into int type
	    //���� ����ȯ(casting) �����
	    int dataint = (int)numdb;
	    System.out.println("The integer value: " + dataint);
	}
}
