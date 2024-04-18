package javaPractice;

abstract class AbstractClass {
	public void method1() {
		System.out.println("method1");
	}

	abstract public void method2();
}

public class concreteClass extends AbstractClass {
	@Override
	public void method2() {
		System.out.println("methods given implementation in concreteclass");
	}
	public static void main(String[] args) {
		concreteClass cr=new concreteClass();
		cr.method1();
		cr.method2();
	}
}