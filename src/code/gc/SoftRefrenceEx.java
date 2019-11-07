package code.gc;

import java.lang.ref.SoftReference;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SoftRefrenceEx {
	
	private Integer x=200;
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.x=null;
		System.out.println("Clean up completed");
	}

	public static void main(String[] args) {
		
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>
		() {
			private static final long serialVersionUID = 1L;

		{
			put(1,2);
			put(3,5);
			put(4,6);
			put(1,8);
			put(5,0);
			
		}};
		
		System.out.println(map);
		
		SoftRefrenceEx ref=new SoftRefrenceEx();
		ref.setX(500);
		SoftReference<SoftRefrenceEx> r=new SoftReference<SoftRefrenceEx>(ref);
		ref=null;
		System.gc();// gc should call but SoftReference Class prevents it to not clean up
		System.out.println(r.get().getX());
		
		Comparator c;
		
		
	}

}
