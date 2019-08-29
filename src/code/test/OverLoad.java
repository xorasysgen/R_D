package code.test;

public class OverLoad {
	
	public void print(Integer x,float y) {
		System.out.println("Integer x,Float y");
	}
	
	public void  print(int x,float y) {
		System.out.println("Float x,Integer y");
	}
	
	
	public void print(int x,Float y) {
		System.out.println("Integer x,Float y");
	}
	
	public void  print(Integer x,Float y) {
		System.out.println("Float x,Integer y");
	}
	
	public void  print(Float x,Integer y) {
		System.out.println("Float x,Integer y");
	}
	
	public void  print(Double x,Integer y) {
		System.out.println("Double x,Integer y");
	}
	
	public void  print(float x,Integer y) {
		System.out.println("float x,Integer y");
	}
	
	public void  print(double x,Integer y) {
		System.out.println("double x,Integer y");
	}
	
	public static void main(String[] args) {
		new OverLoad().print(new Integer(2), new Float(5.0));
		new OverLoad().print(new Float(5.0),new Integer(2));
		new OverLoad().print(new Double(5.0),new Integer(2));
		new OverLoad().print(5.0,new Integer(2));
		new OverLoad().print(5.0f,new Integer(2));
		
	}
}
