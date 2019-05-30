package com.skbh.impl;

import java.util.ArrayList;
import java.util.List;



class Model{
	
	private Integer x;
	private String name;
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Model [x=" + x + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((x == null) ? 0 : x.hashCode());
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
		Model other = (Model) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		return true;
	}
	
}

public class ListTest {

	public static void main(String[] args) {
		Model model=new Model();
		model.setX(1);
		model.setName("sushil");
		
		Model model1=new Model();
		model1.setX(2);
		model1.setName("kumar");
		Model model2=new Model();
		model2.setX(3);
		model2.setName("bhaskar");
		
		List<Model> list=new ArrayList<Model>();
		list.add(model);
		list.add(model1);
		list.add(model2);
		System.out.println(list);
		Model m=new Model();
		m.setX(2);
		m.setName("kumar");
		
		if(list.contains(m)){
			list.remove(m);
			System.out.println("Model found!");
		}
		else
			System.out.println("Model Not found!");
			
		System.out.println(list);

	}

}
