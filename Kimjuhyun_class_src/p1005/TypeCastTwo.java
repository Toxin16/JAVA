package p1005;

class Abc {
	int a, b, c;
	public Abc() {
		a = b = c = 1;
	}
}
class Def {
	int d, e, f;
	public Def() {
		d = e = f = 2;
	}
}
public class TypeCastTwo {
	static Object rtnClass(Object obj) {
		return obj;
	}
	public static void main(String[] args) {
		Abc abc = new Abc();
		Def def = new Def();
		rtnClass(abc);
	}
}
