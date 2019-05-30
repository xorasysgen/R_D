package code.date;

class Parents {
	
	private String name; 
	
	Parents(String x){
		this.name=x;
		System.out.println("Parents" + name);
	}
	
}


class  Child extends Parents{
	private String namea; 
	Child(String x){
		super(x.concat("kumar bhaskar"));
		namea=x;
		System.out.println("child" + namea);
	}
	
}


public class GotoExample {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(2147483647));
		new Child("sushil");

	}

}
