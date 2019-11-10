package code.java8.ext;

import java.util.function.Predicate;

class AffirmativeOrNegative implements Predicate<String>{

	@Override
	public boolean test(String arg0) {
		if(arg0.equals(""))
			return false;
			return true;
	}
}

public class PredicateTest {
	
	static Predicate<String> p=(arg0)->{
			if(arg0.equals(""))
				return false;
				return true;
		};
	

	public static void main(String[] args) {
		System.out.println(new AffirmativeOrNegative().test(""));
		System.out.println(new AffirmativeOrNegative().test(" "));
		
		System.err.println(PredicateTest.p.test(""));
		}

}
