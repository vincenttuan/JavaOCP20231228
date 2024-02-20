package day13;

public class TestOuter {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.callMe();

	}

}
