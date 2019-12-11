package code.java8.string;

import java.util.HashMap;
import java.util.Map;

class pojo{
	private Integer i;

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i == null) ? 0 : i.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pojo other = (pojo) obj;
		if (i == null) {
			if (other.i != null)
				return false;
		} else if (!i.equals(other.i))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "pojo [i=" + i + "]";
	}
	
	
	
}

public class StringTest2 {

	public static void main(String[] args) {
		pojo p=new pojo();
		p.setI(1);
		
		pojo p1=new pojo();
		p1.setI(1);

		
		Map<pojo,Integer> map=new HashMap<>();
		System.out.println(map.put(p, 10));
		
		System.out.println(map.put(p1, 100));
		p.setI(null);
		
		System.out.println("--------------------");
		System.out.println(map);
	
		

	}

}
