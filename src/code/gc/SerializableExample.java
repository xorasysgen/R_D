package code.gc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void serializeObject(Object object) {
		Universe u = null;
		if(object instanceof Universe) {
			u=(Universe) object;
		} 
		try {
			FileOutputStream fs=new FileOutputStream("universe.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(u);
			os.close();
		} catch (IOException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		
		
	}
	
	public static Universe readFromSerializedObject() {
		Universe u = null;
		
		try {
			FileInputStream fs=new FileInputStream("universe.ser");
			ObjectInputStream os=new ObjectInputStream(fs);
			u=(Universe) os.readObject();
			os.close();
		} catch (IOException | ClassNotFoundException exceptionObject) {
			exceptionObject.printStackTrace();
		}
		
		return u;
	}
	
	public static void main(String[] args) {
		Universe u=new Universe();
		u.setPlanateId(100);
		u.setPlanet("Sun");
		u.setPlanateMass(65699365d);
		SerializableExample.serializeObject(u);
		Universe u1=SerializableExample.readFromSerializedObject();
		if(u1!=null) {
		System.out.println(u1.getPlanateId());
		System.out.println(u1.getPlanateMass());
		System.out.println(u1.getPlanet());
		}
	}

}
