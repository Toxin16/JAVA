package p0919;

public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for(int i=0; i<args.length; i++)
			sum += Double.parseDouble(args[i]);	//args값을 문자열로 받는데 parseDouble로 실수로 받아옴
		
		System.out.println("sum = " + sum);
	}
}
