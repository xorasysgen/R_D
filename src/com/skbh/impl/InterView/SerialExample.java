package com.skbh.impl.InterView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ObjectModel implements Serializable {

	private static final long serialVersionUID = 1L;
	transient private Integer id;
	private String name;
	private String ver;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	@Override
	public String toString() {
		return "ObjectModel [id=" + id + ", name=" + name + ", ver=" + ver
				+ "]";
	}
	
	

}

public class SerialExample {

	public static void writeObjectEx(ObjectModel objectModel)
			throws IOException {

		FileOutputStream fis = new FileOutputStream(new File("object_Model.ser"));
		ObjectOutputStream oo = new ObjectOutputStream(fis);
		oo.writeObject(objectModel);
		oo.close();
		fis.close();
	}
	
	
	public static ObjectModel readObject() throws IOException, ClassNotFoundException{
		FileInputStream fis=new FileInputStream("object_Model.ser");
		ObjectInputStream oo=new ObjectInputStream(fis);
		ObjectModel m=(ObjectModel) oo.readObject();
		oo.close();
		return m;
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectModel objectModel = new ObjectModel();
		objectModel.setId(101);
		objectModel.setName("Serilized Objects");
		objectModel.setVer("V1.0.2.255");
		writeObjectEx(objectModel);
		System.out.println("serilize Object : " + readObject().toString());

	}

}
