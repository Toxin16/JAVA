package p1005;

public class PrimitiveTypeCast {
	public static void main(String[] args) {
		//byte - short - char - int - long - float - double
		//boolean은 다른 타입과 형변환이 안됨.
		//create int type variable
		int num = 10;
		System.out.println("The integer value : " + num);
		//convert into double type
		//자동 형변환(casting) 묵시적
		double data = num;
		System.out.println("The double value : " + data);
		
		 // create double type variable
	    double numdb = 10.99;
	    System.out.println("The double value: " + numdb);
	    // convert into int type
	    //강제 형변환(casting) 명시적
	    int dataint = (int)numdb;
	    System.out.println("The integer value: " + dataint);
	}
}
