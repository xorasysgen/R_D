package code.java8;

interface top{
	int get(int x,int y);//sam
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		top a= (x,y)-> x+y;
		top b= (x,y)-> x-y;
		System.out.println(a.get(2, 6));
		System.out.println(b.get(8, 9));

	}

}
