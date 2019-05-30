package code.java8;

public interface DefaultInInterface {
	
	static String defaultMethod() {
		return "default static method";
	}
	
	default String defaultMethodOverridden(final int x) {
		return "default one" + x;
	} 
	
	default String defaultMethodOverridden1() {
		return "default two";
	} 
	
	String otherMethod(final int x);
	
}
