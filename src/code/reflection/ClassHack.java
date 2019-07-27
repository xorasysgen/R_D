package code.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.skbh.impl.LengthOfString;

public class ClassHack {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz=Class.forName("com.skbh.impl.LengthOfString");
		LengthOfString object=(LengthOfString) clazz.newInstance();
		Method m=clazz.getDeclaredMethod("lengthOfStringPrivate",new Class[]{String.class});
		m.setAccessible(true);
		System.out.println(m.invoke(object,"asdf kjthjlJK"));

	}

}
