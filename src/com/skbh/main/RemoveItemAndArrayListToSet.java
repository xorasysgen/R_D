package com.skbh.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

class ModelObject {
	
	@Override
	public String toString() {
		return "ModelObject [id=" + id + ", name=" + name + "]";
	}
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ModelObject other = (ModelObject) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}


public class RemoveItemAndArrayListToSet{

	public static void main(String[] args) {
		List<ModelObject> list=new ArrayList<ModelObject>();
		int i=0;
		while(true){
			ModelObject ModelObject=new ModelObject();
			ModelObject.setId(i+"");	ModelObject.setName("name" + i);	list.add(ModelObject);
			if(++i>5)
				break;
		}
		
		ModelObject search=new ModelObject();
		search.setId("5");
		search.setName("name5");
		list.add(search);
		
		System.out.println(list);
		
		for(Iterator<ModelObject> it=list.iterator();it.hasNext();){
			if(it.next().equals(search))
				it.remove();
		}
		System.out.println(list);
		System.out.println(new LinkedHashSet<ModelObject>(list));
		
		
	}

}
