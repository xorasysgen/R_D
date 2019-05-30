package com.skbh.impl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface NotNullKey {
	String copyWriteName();
}

class TestAnnotationParser{
	public void parseAnnotation(){
		NotNullKey notNullKey = null;
		try {
			notNullKey = this.getClass().getMethod("parseAnnotation").getAnnotation(NotNullKey.class);
			if(notNullKey.equals(null))
				System.out.println("Please provide value for field");
			else
				System.out.println("not null");
		} catch (NoSuchMethodException | SecurityException exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}
	
}