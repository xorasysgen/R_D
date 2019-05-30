package code.java8;

public class DefaultInInterfaceImpl implements DefaultInInterface{
	
	@Override
	public String defaultMethodOverridden1() {
		return "overridden default method1";
	}

	public static void main(String[] args) {
		System.out.println(DefaultInInterface.defaultMethod());
		DefaultInInterfaceImpl defaultInInterfaceImpl=new DefaultInInterfaceImpl();
		System.out.println(defaultInInterfaceImpl.defaultMethodOverridden(56));
		System.out.println(defaultInInterfaceImpl.defaultMethodOverridden1());
		System.out.println(defaultInInterfaceImpl.otherMethod(596));
	}

	@Override
	public String defaultMethodOverridden(final int x) {
		return DefaultInInterface.super.defaultMethodOverridden(x);
	}

	@Override
	public String otherMethod(int x) {
		new Object();
		return "OtherMethod# " + x;
	}

	

}
