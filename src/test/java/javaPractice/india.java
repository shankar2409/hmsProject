package javaPractice;

public interface india {
	void karnataka();

	default void tamilnadu() {
		System.out.println("dkfjsf");
	}

	void kerala();
	public static void staticMethod() {
		System.out.println("static method in interface");
	}
}
