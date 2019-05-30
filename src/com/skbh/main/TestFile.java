package com.skbh.main;

import java.util.HashMap;
import java.util.Map;

final class Key{
	private String key;

	public Key(String key){
		this.key=key;
	}
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "Key [key=" + key + "]";
	}

	
	
	
	
}

public class TestFile {

	public static void main(String[] args) {
		String s=new String("sushil");
		Map<Key,String> map=new HashMap<Key,String>();
		Key key1=new Key("key1");
		map.put(key1, "value1");
		map.put(key1, "value1");
		System.out.println(map);
		String t="34 35f sdf f " ;
		System.out.println(t.replaceAll("\\s",""));
		
	}
	@Copyright(copyWriteAddress = "D-50,New Friends Colony, New Delhi, India", copyWriteName = "Sushil Kumar bhaskar")
	 public void myMethod()
	   {
	       System.out.println();
	   }

}
