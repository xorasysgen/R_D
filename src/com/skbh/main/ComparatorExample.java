package com.skbh.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import code.test.Items;

class CompareItems implements Comparator<Items>{

	@Override
	public int compare(Items o1, Items o2) {
		
		if(o1.getId()<o2.getId())
			return 1;
		else if(o1.getId()==o2.getId())
			return 0;
		else
			return -1;
	}
	
}



public class ComparatorExample {

	public static void main(String[] args) {
		
		Items obj=new Items();
		obj.setId(4);
		obj.setItemBrand("Relience Digital");
		obj.setItemName("Laptop X859");
		obj.setItemMfd(new Date());
		obj.setItemPrice(256999.00);
		obj.setItemDescription("Brand new Laptop");
		Items obj2=new Items();
		obj2.setId(7);
		obj2.setItemBrand("Samsung Electronics");
		obj2.setItemName("Mobile Phone");
		obj2.setItemMfd(new Date());
		obj2.setItemPrice(26999.00);
		obj2.setItemDescription("Samsung S4 edge");
		
		Items obj3=new Items();
		obj3.setId(1);
		obj3.setItemBrand("Microsoft");
		obj3.setItemName("Gadgets Phone");
		obj3.setItemMfd(new Date());
		obj3.setItemPrice(35999.00);
		obj3.setItemDescription("Microsoft E900 Sharp");
		
		List<Items> item=new ArrayList<Items>();
		item.add(obj);
		item.add(obj2);
		item.add(obj3);
		Collections.sort(item,new CompareItems());
		
		System.out.println(item);

	}

}
