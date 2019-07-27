package code.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import code.math.RandomGenerator;

public class Reflx1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		RandomGenerator r;
		Class<?> cla=null;
		Method m = null;
		
		cla=Class.forName("code.math.RandomGenerator");
		r=(RandomGenerator) cla.newInstance();
		
		m = cla.getDeclaredMethod("getRandomToken");
		
		m.setAccessible(true);
		System.out.println(m.invoke(r));
		m.setAccessible(false);
		
		Field field = cla.getDeclaredField("finalVar");
        field.setAccessible(true);

        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, 25);
		
		
		        
        System.out.println(r.getS());
	}

}
