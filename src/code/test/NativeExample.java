package code.test;

class Happy
{
public native void printText ();
static
{
System.loadLibrary ("happy");   /* Note lowercase of classname! */
}
}

public class NativeExample {

	static
	{
		System.loadLibrary ("happy");
	}
	
	public static void main(String[] args) {
		Happy happy = new Happy();
		   happy.printText ();

	}

}
