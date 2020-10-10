package interviewquestions.interfaceandabstract;

@FunctionalInterface
interface InterfaceClass {
	
	int num = 10;
	String str = "abc";
	
	static String staticClass(String str) {
		System.out.println("Static method called with arguments");
		return "Static method called";
	}
	static void staticClass() {
		System.out.println("Static method called");
	}
	
	
	default void defaultMethod(String str) {
		System.out.println(str);
	}
	
	public void abstractMethod();
}
