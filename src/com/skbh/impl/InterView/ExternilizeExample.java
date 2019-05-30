package com.skbh.impl.InterView;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;


class ObjectModels implements Externalizable, Cloneable {

	private static final long serialVersionUID = 1L;

	transient private int id;
	private StringBuilder name;
	private StringBuilder ver;
	private HashMap<String,String> map;
	
	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StringBuilder getName() {
		return name;
	}

	public void setName(StringBuilder name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public StringBuilder getVer() {
		return ver;
	}

	public void setVer(StringBuilder ver) {
		this.ver = ver;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjectModels [name=");
		builder.append(name);
		builder.append(", ver=");
		builder.append(ver);
		builder.append(", map=");
		builder.append(map);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
		out.writeObject(ver);
		out.writeObject(map);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (StringBuilder) in.readObject();
		id = in.readInt();
		ver = (StringBuilder) in.readObject();
		map=(HashMap<String, String>) in.readObject();

	}

	public ObjectModels() {

	}

	protected Object clone() throws CloneNotSupportedException {
			// throw new CloneNotSupportedException("you can't clone");
		ObjectModels objectModels=new ObjectModels();
		objectModels.setId(this.getId());
		objectModels.setName(this.getName());
		objectModels.setVer(this.getVer());
		return  objectModels;
	}

}

public class ExternilizeExample {

	public static void writeObjectEx(ObjectModels objectModel)
			throws IOException {

		FileOutputStream fis = new FileOutputStream(new File(
				"object_Models_class_test.ser"));
		ObjectOutputStream oo = new ObjectOutputStream(fis);
		oo.writeObject(objectModel);
		oo.close();
		fis.close();
	}

	public static ObjectModels readObject() throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream(
				"object_Models_class_test.ser");
		ObjectInputStream oo = new ObjectInputStream(fis);
		ObjectModels m = (ObjectModels) oo.readObject();
		oo.close();
		return m;

	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		ObjectModels objectModel = new ObjectModels();
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("key", "value");
		map.put("key1", "value1");
		objectModel.setId(201);
		objectModel.setName(new StringBuilder("Serilization Objects"));
		objectModel.setVer(new StringBuilder("V1.0.2.255"));
		objectModel.setMap(map);
		writeObjectEx(objectModel);
		System.out.println("serilize Object : " + readObject().toString());

	}

}
