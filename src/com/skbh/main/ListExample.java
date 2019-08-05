package com.skbh.main;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		String source="suSSSS323543                         du$%";
		System.out.println(source.replaceAll("[^a-zA-Z0-9 ]","").toLowerCase().replaceAll("\\s+", " ").trim());
		
		List<String> list=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
	
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
	
		list2.add("10");
		list2.add("9");
		list2.add("8");
		list2.add("7");
		list2.add("6");
		list2.add("5");
		list2.add("4");
		list2.add("3");
		list2.add("2");
		list2.add("1");

		

int size1=list.size();
int size2=list2.size();
List<String> listTobeprocessed=(size1>=size2)?list:list2;
List<String> list1=(size1<size2)?list:list2;
		for (String string : listTobeprocessed) {
			System.out.print(list1.contains(string) + "\t");
			
			/*if(list.contains(string))
			break;*/
		}
		
		//System.out.println(list.contains(list2.get(0)));
		
		int a=0,b=0,c=0;
		if(a==1){
			System.out.println("a==1");
		}else if(b==2){
			System.out.println("b==2");
		}else if(c==3){
			System.out.println("c==3");
		}else{
			System.out.println("none");
		}
		
		System.out.println(0.1 * 3);

	}

}
