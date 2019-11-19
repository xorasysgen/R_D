package code.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

public class ObjectCreation {

	
	public static void main(String[] args) {
		try {
			Class<?> server=Class.forName("code.reflection.Server");
			Server serverIns=(Server) server.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
		Constructor<Server> cons;
		try {
			cons = Server.class.getDeclaredConstructor();
			Server ser=cons.newInstance();
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		}
	

}
